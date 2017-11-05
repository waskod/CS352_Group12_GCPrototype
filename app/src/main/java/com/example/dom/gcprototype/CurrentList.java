package com.example.dom.gcprototype;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class CurrentList extends AppCompatActivity {

    ListView currentListListView;
    String[] items, itemDescriptions, quantities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_list);

        //shortcut reference
        Resources res = getResources();

        //getting reference for the list object
        currentListListView = (ListView) findViewById(R.id.currentListListView);

        //getting the values from strings.xml
        items = res.getStringArray(R.array.items);
        itemDescriptions = res.getStringArray(R.array.itemDescriptions);
        quantities = res.getStringArray(R.array.quantities);

        //savedLists.setAdapter(new ArrayAdapter<String>(this, R.layout.saved_lists_detail, lists));

        savedListAdapter adapt = new savedListAdapter(this, items, itemDescriptions, quantities);
        currentListListView.setAdapter(adapt);


    }
}
