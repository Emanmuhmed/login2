package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity  implements View.OnClickListener{
EditText muser;
EditText mpass;
Button Mlogin, mSingup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiviews();
    }

    private void intiviews() {
        muser=findViewById(R.id.user0);
        mpass =findViewById(R.id.pass1);
        Mlogin=findViewById(R.id.login);
        Mlogin.setOnClickListener(this);
        mSingup= findViewById(R.id.signup);
        mSingup.setOnClickListener(this);

    }




    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login:
                //validation
                if (!(muser.getText().toString().equalsIgnoreCase("student@gmailcom"))) {
                    Toast.makeText(SignIn.this, "please enter vaild email", Toast.LENGTH_LONG).show();

                } else if (!(mpass.getText().toString().equalsIgnoreCase("1234567899 "))) {
                    Toast.makeText(SignIn.this, "please enter vaild pass", Toast.LENGTH_LONG).show();

                } else {
                    Intent i = new Intent(SignIn.this, Recycle.class);
                    startActivity(i);
                    break;

                }

            case R.id.signup:
                Intent intent = new Intent(SignIn.this, SignUp.class);
                startActivity(intent);
                break;

        }
    }}
