package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    Button Mlogin1,mSignUp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       initviews();
    }

    private void initviews() {
    Mlogin1=findViewById(R.id.login);
        mSignUp=findViewById(R.id.signup);
        Mlogin1.setOnClickListener(this);

                }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login:
                Intent i = new Intent(SignUp.this, SignIn.class);
                startActivity(i);
                break;

            case R.id.signup:
                Intent intent = new Intent(SignUp.this, Recycle.class);
                startActivity(intent);
                break;
        }


        }
    }
