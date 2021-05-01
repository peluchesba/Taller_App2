package com.example.taller_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText Id_Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Id_Email = (EditText)findViewById(R.id.Id_Email);
    }

    public void Validacion(View view) {
        Intent validacion = new Intent(this, ValidationActivity.class);
        Toast.makeText(this, "Te estan validando", Toast.LENGTH_SHORT).show();
        validacion.putExtra("correo",Id_Email.getText().toString());
        startActivity(validacion);
    }

    public void Home(View view) {
        Intent home = new Intent(this, MainActivity.class);
        Toast.makeText(this, "A casa", Toast.LENGTH_SHORT).show();
        startActivity(home);
    }
}