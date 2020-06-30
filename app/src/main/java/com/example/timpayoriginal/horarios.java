package com.example.timpayoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class horarios extends AppCompatActivity {
    private Button btnVoltar1;
    private Button btnVisualizarHorarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarios);

        btnVoltar1 = (Button) findViewById(R.id.btnVoltar1);
        btnVisualizarHorarios = (Button) findViewById(R.id.btnVisualizarHorarios);

        btnVoltar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnVoltar();
            }
            private void btnVoltar(){startActivity(new Intent(horarios.this, menu.class));}
        });
        btnVisualizarHorarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnVisualizarHorarios();
            }
            private void btnVisualizarHorarios(){startActivity(new Intent(horarios.this, visualizarHorarios.class));}
        });
    }
}