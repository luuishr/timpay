package com.example.timpayoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    private Button btnHorarios;
    private Button btnClientes;
    private Button btnSortear;
    private Button btnPlacar;
    private Button btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnHorarios = (Button) findViewById(R.id.btnHorarios);
        btnClientes = (Button) findViewById(R.id.btnClientes);
        btnSortear = (Button) findViewById(R.id.btnSortear);
        btnPlacar = (Button) findViewById(R.id.btnPlacar);
        btnSair = (Button) findViewById(R.id.btnSair);

        btnHorarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirHorarios();
            }
        });

        btnClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirClientes();
            }
        });

        btnSortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSortear();
            }
        });

        btnPlacar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPlacar();
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnVoltar();
            }
        });

        }
    private void abrirHorarios(){
        startActivity(new Intent(menu.this, horarios.class));
    }
    private void abrirClientes(){
        startActivity(new Intent(menu.this, clientes.class));
    }
    private void abrirSortear(){
        startActivity(new Intent(menu.this, sorteartimes.class));
    }
    private void abrirPlacar(){
        startActivity(new Intent(menu.this, placar.class));
    }
    private void btnVoltar(){ startActivity(new Intent(menu.this, MainActivity.class));
    }

}