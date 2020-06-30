package com.example.timpayoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtUsuario;
    private EditText txtSenha;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMenu();
                String usuario = txtUsuario.getText().toString();
                String senha = txtSenha.getText().toString();

                if(!usuario.equals("")&& !senha.equals("")){
                    if(usuario.equals("admin") && senha.equals("1234")){
                        Toast.makeText(MainActivity.this, "LOGIN EFETUADO COM SUCESSO", Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "PREENCHA TODOS OS CAMPOS CORRETAMENTE", Toast.LENGTH_LONG).show();

                }
            }
        });
    }

    private void abrirMenu(){
        startActivity(new Intent(MainActivity.this, menu.class));
    }
}