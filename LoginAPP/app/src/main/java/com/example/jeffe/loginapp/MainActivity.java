package com.example.jeffe.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private Button autbuton;
    private EditText login;
    private EditText senha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autbuton = (Button) findViewById(R.id.autenticar);
        login = (EditText) findViewById(R.id.login);
        senha = (EditText) findViewById(R.id.senha);

        OnClickListener buttonListener = new OnClickListener() {
            @Override
            public void onClick(View v) {

                String senhaR = senha.getText().toString();
                String loginR = login.getText().toString();


                if(senhaR.equals("pass") && loginR.equals("admin")){

                    Toast.makeText(getApplicationContext(), "Autenticado",Toast.LENGTH_SHORT).show();
                }

                else{

                    Toast.makeText(getApplicationContext(), "Dados Invalidos",Toast.LENGTH_SHORT).show();
                }

            }
        };

        autbuton.setOnClickListener(buttonListener);

    }
}
