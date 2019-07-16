package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button about= (Button) findViewById(R.id.About_ALC);
        about.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent aboutIntent = new Intent(getApplicationContext(), AboutALC.class);
                startActivity(aboutIntent);
            }
        });

        Button MyProfile= (Button) findViewById(R.id.My_Profile);
        MyProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View m) {
                System.out.println("Button Clicked");

                Intent MyProfileIntent = new Intent(getApplicationContext(), MyProfile.class);
                startActivity(MyProfileIntent);
            }
        });



    }

}
