package com.example.practice01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Drawable drawable;

    EditText name_user ,age_user,school_user;
    Button BtnResgister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.image_logo);
        drawable=getResources().getDrawable(R.drawable.img);
        imageView.setImageDrawable(drawable);



        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
           name_user=findViewById(R.id.name);
           age_user=findViewById(R.id.age);
          school_user=findViewById(R.id.school);


        BtnResgister=(Button)findViewById(R.id.Submit);
        BtnResgister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=name_user.getText().toString();
                String age=age_user.getText().toString();
                String school_name=school_user.getText().toString();
                Information_user information_user=new Information_user(name,age,school_name);
                intent.putExtra("key",information_user);


               startActivity(intent);

            }
        });




    }


}