package com.example.taller_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Id_Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Id_Login = (EditText)findViewById(R.id.Id_Login);
    }

    public void iniciosesion(View view) {
        Intent inicio = new Intent(this, WelcomeActivity.class);
        Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
        inicio.putExtra("usuario",Id_Login.getText().toString());
        startActivity(inicio);
    }




    public void Registrar(View view) {
        Intent registrar = new Intent(this, RegisterActivity.class);
        Toast.makeText(this, "Te estas registrando", Toast.LENGTH_SHORT).show();
        startActivity(registrar);
    }




}
