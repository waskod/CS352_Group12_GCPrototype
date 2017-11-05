package com.example.dom.gcprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ListMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);

        //use this format to access data if the previous screen sent data
        /*
        if(getIntent().hasExtra("org.mentorschools.SOMETHING"))
        {
            TextView v = (TextView) findViewById(R.id.textview)
            String text = getIntent().getExtras().getString("org.mentorschools.something");
            tv.setText(text);
        }

         */

        //Setting references in code for the buttons on the design page.
        Button currentListBtn = (Button) findViewById(R.id.currentListBtn);
        Button newListBtn = (Button) findViewById(R.id.newListBtn);
        Button savedListBtn = (Button) findViewById(R.id.savedListBtn);

        //Event listener for the current list button. Takes user to the current list screen
        currentListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //declare intent to move to instance of the current list screen
                Intent moveToCurrent = new Intent(getApplicationContext(), CurrentList.class);

                //start the activity of moving to the current list screen
                startActivity(moveToCurrent);

            }
        });

        //Event listener for the new list button. Takes uer to the new list screen
        newListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //declare intent to move to instance of the new list screen
                Intent moveToNew = new Intent(getApplicationContext(), NewList.class);

                //start the activity of moving to the new list screen
                startActivity(moveToNew);

            }
        });

        //Event listener for the saved list button. Takes user to the saved lists screen.
        savedListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //declare intent to move to instance of the saved lists screen
                Intent moveToSaved = new Intent(getApplicationContext(), SavedLists.class);

                //start the activity of moving to the saved lists screen
                startActivity(moveToSaved);

            }
        });

    }
}
