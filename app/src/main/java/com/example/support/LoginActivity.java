package com.example.support;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView registerHere = findViewById(R.id.registerHere);
        Button login = findViewById(R.id.loginActivityBtn);

        registerHere.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this, RegisterActivity.class)));
        login.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this, MainActivity.class)));
    }
}