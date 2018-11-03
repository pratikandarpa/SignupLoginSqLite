package com.example.sinuploginsqlite.signuploginsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Successfull extends AppCompatActivity {

    public TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successfull);

        t1= (TextView)findViewById(R.id.succe);
        String s=getIntent().getStringExtra("email");
        String s1=getIntent().getStringExtra("pass");

        t1.setText("Welcome \n\n"+
                "Your Email ID: " +s + "\n\n"+
                "Your PassWord: " +s1);
    }
}
