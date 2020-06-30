package com.example.timpayoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class visualizarHorarios extends AppCompatActivity {
    private Button btnVoltar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_horarios);

        btnVoltar1 = (Button) findViewById(R.id.btnVoltar1);

        btnVoltar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnVoltar();
            }
            private void btnVoltar(){startActivity(new Intent(visualizarHorarios.this, horarios.class));}
        });
    }
}