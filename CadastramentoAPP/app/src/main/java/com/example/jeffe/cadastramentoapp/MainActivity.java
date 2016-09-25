package com.example.jeffe.cadastramentoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button button;
    AutoCompleteTextView autoCompleteTextView1;
    AutoCompleteTextView autoCompleteTextView2;

    String[] diretorias;
    String[] cursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diretorias =  getResources().getStringArray(R.array.diretorias);
        cursos = getResources().getStringArray(R.array.cursos);
        button = (Button) findViewById(R.id.cadastrar);

        autoCompleteTextView1 = (AutoCompleteTextView) findViewById(R.id.diretoria);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,diretorias);
        autoCompleteTextView2 = (AutoCompleteTextView) findViewById(R.id.curso);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,cursos);

        autoCompleteTextView1.setThreshold(2);
        autoCompleteTextView1.setAdapter(adapter);

        autoCompleteTextView2.setThreshold(2);
        autoCompleteTextView2.setAdapter(adapter2);

        OnClickListener buttonListener = new OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Cadastrado",Toast.LENGTH_SHORT).show();

            }
        };

        button.setOnClickListener(buttonListener);

    }
}
