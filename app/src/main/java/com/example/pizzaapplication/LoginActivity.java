package com.example.pizzaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView noAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        noAccount = findViewById(R.id.noAccountTextId2);



        noAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noTextClick();
            }
        });
        noTextClick();


    }

    void noTextClick(){
        Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
        startActivity(intent);
    }
}