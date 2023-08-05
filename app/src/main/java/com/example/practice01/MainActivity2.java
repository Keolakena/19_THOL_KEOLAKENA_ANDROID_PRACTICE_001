package com.example.practice01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button close_btn;

    TextView nameText,ageText,schoolText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameText=findViewById(R.id.names);
        ageText=findViewById(R.id.ages);
        schoolText=findViewById(R.id.schools);

     Information_user information_user=getIntent().getParcelableExtra("key");
     nameText.setText("Name :  "+information_user.name);
        ageText.setText("Age :   "+information_user.age);
        schoolText.setText("University :  "+information_user.school_name);


      close_btn=(Button) findViewById(R.id.close_btn);
        close_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);

            }
        });


    }
}