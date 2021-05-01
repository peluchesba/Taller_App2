package com.example.taller_app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ValidationActivity extends AppCompatActivity {

    private TextView Id_valida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);

        Id_valida = (TextView)findViewById(R.id.Id_valida);

        String vara = getIntent().getStringExtra("correo");
        Id_valida.setText("Se ha creado un correo de validacion a  " + vara);

    }

    public void Home(View view) {
        Intent home = new Intent(this, MainActivity.class);
        Toast.makeText(this, "Volviendo", Toast.LENGTH_SHORT).show();
        startActivity(home);
    }

}