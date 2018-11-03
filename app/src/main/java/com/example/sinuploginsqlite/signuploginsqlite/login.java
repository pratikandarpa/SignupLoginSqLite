package com.example.sinuploginsqlite.signuploginsqlite;

import android.content.Intent;
import android.database.Cursor;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    DatabaseHelper db;
    public EditText e1,e2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new DatabaseHelper(this);
        e1=(EditText) findViewById(R.id.Emaill);
        e2=(EditText) findViewById(R.id.Passl);
        b1=(Button) findViewById(R.id.button2l);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e1.getText().toString();
                String pass = e2.getText().toString();

//                Cursor cursor=db.alldata();
//                String m1=cursor.getString(0);

                Boolean chkmailpassword = db.chkmailpassword(email,pass);
                if (chkmailpassword==true){
                    Toast.makeText(getApplicationContext(), "Login Successfully", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(login.this,Successfull.class);
                    i.putExtra("email",email);
                    i.putExtra("pass",pass);
                    startActivity(i);



                }
                else
                    Toast.makeText(getApplicationContext(), "Enter valid email or password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
