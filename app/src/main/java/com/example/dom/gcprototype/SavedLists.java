package com.example.dom.gcprototype;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class SavedLists extends AppCompatActivity {

    //declarations
    ListView savedLists;
    String[] lists, dates, listDescriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_lists);

        //shortcut reference
        Resources res = getResources();

        //getting reference for the list object
        savedLists = (ListView) findViewById(R.id.savedLists);

        //getting the values from strings.xml
        lists = res.getStringArray(R.array.lists);
        dates = res.getStringArray(R.array.dates);
        listDescriptions = res.getStringArray(R.array.listDescriptions);

        //savedLists.setAdapter(new ArrayAdapter<String>(this, R.layout.saved_lists_detail, lists));

        savedListAdapter adapt = new savedListAdapter(this, lists, listDescriptions, dates);
        savedLists.setAdapter(adapt);
    }
}
