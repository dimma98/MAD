package com.example.myapplication.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.util.List;

import com.example.myapplication.Common.Common;
import com.example.myapplication.MainActivity_1;

/**
 * Created by reale on 3/9/2017.
 */

public class GridViewSuggestAdapter_1 extends BaseAdapter {

    private List<String> suggestSource;
    private Context context;
    private MainActivity_1 mainActivity1;

    public GridViewSuggestAdapter_1(List<String> suggestSource, Context context, MainActivity_1 mainActivity1) {
        this.suggestSource = suggestSource;
        this.context = context;
        this.mainActivity1 = mainActivity1;
    }

    @Override
    public int getCount() {
        return suggestSource.size();
    }

    @Override
    public Object getItem(int position) {
        return suggestSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Button button;
        if(convertView == null)
        {
            if(suggestSource.get(position).equals("null"))
            {
                button = new Button(context);
                button.setLayoutParams(new GridView.LayoutParams(85,85));
                button.setPadding(8,8,8,8);
                button.setBackgroundColor(Color.DKGRAY);
            }
            else
            {
                button = new Button(context);
                button.setLayoutParams(new GridView.LayoutParams(85,85));
                button.setPadding(8,8,8,8);
                button.setBackgroundColor(Color.DKGRAY);
                button.setTextColor(Color.WHITE);
                button.setText(suggestSource.get(position));
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //If correct answer contains character user selected
                        if(String.valueOf(mainActivity1.answer).contains(suggestSource.get(position)))
                        {
                            char compare = suggestSource.get(position).charAt(0); // Get char

                            for(int i = 0; i< mainActivity1.answer.length; i++)
                            {
                                if(compare == mainActivity1.answer[i])
                                    Common.user_submit_answer[i] = compare;
                            }

                            //Update UI
                            com.example.myapplication.Adapter.GridViewAnswerAdapter answerAdapter = new com.example.myapplication.Adapter.GridViewAnswerAdapter(Common.user_submit_answer,context);
                            mainActivity1.gridViewAnswer.setAdapter(answerAdapter);
                            answerAdapter.notifyDataSetChanged();

                            //Remove from suggest source
                            mainActivity1.suggestSource.set(position,"null");
                            mainActivity1.suggestAdapter = new GridViewSuggestAdapter_1(mainActivity1.suggestSource,context, mainActivity1);
                            mainActivity1.gridViewSuggest.setAdapter(mainActivity1.suggestAdapter);
                            mainActivity1.suggestAdapter.notifyDataSetChanged();
                        }
                        else // else
                        {
                            //Remove from suggest source
                            mainActivity1.suggestSource.set(position,"null");
                            mainActivity1.suggestAdapter = new GridViewSuggestAdapter_1(mainActivity1.suggestSource,context, mainActivity1);
                            mainActivity1.gridViewSuggest.setAdapter(mainActivity1.suggestAdapter);
                            mainActivity1.suggestAdapter.notifyDataSetChanged();
                        }
                    }
                });
            }
        }
        else
            button = (Button)convertView;
        return button;

    }
}
