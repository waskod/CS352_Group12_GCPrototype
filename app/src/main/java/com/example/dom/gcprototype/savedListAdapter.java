package com.example.dom.gcprototype;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by dom on 11/4/2017.
 */

public class savedListAdapter extends BaseAdapter {
    String[] lists, dates, listDescriptions;
    LayoutInflater mInflater;

    public savedListAdapter(Context c, String[] lis, String[] desc, String[] dat)
    {
        lists = lis;
        dates = dat;
        listDescriptions = desc;
        mInflater =  (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return lists.length;
    }

    @Override
    public Object getItem(int i) {
        return lists[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.saved_lists_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView dateTextView = (TextView) v.findViewById(R.id.dateTextView);
        TextView descTextView = (TextView) v.findViewById(R.id.descTextView);

        String name = lists[i];
        String desc = listDescriptions[i];
        String date = dates[i];

        nameTextView.setText(name);
        descTextView.setText(desc);
        dateTextView.setText(date);

        return v;
    }
}
