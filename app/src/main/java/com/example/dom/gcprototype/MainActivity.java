package com.example.dom.gcprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button addBtn = (Button) findViewById(R.id.addBtn);
        //addBtn.setOnClickListener(new OnClickListener(){});
        Button login = (Button) findViewById(R.id.logInButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code button press here
                //int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                //resultTextView.setText(result + "");
                Intent startIntent = new Intent(getApplicationContext(), ListMenu.class);
                //pass info to second screen
                //dtartIntent.putExtra("org.mentorschools.quicklauncher.SOMETHING", "Hello World");
                startActivity(startIntent);
            }
        });
    }
}
