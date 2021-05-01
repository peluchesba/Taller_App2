package com.example.taller_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private TextView Id_wel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Id_wel = (TextView)findViewById(R.id.Id_wel);

        String var = getIntent().getStringExtra("usuario");
        Id_wel.setText("Bienvenido " + var);
    }
}