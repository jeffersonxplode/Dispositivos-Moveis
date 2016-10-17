package com.example.jeffe.agendacontatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText editText1;
    private EditText editText2;
    private Button button1;
    private Button button2;
    private Button button3;
    private TextView textView1;

    private Agenda agenda;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agenda = new Agenda();
        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        textView1 = (TextView) findViewById(R.id.textView);



    }

    public void buttonClick(View v) {

        if(v == button1){

            agenda.inserir(editText1.getText().toString(),editText2.getText().toString());
        }

        if(v == button2){

            agenda.editar(editText1.getText().toString(),editText2.getText().toString());
        }

        if(v == button3){

            agenda.excluir(editText1.getText().toString(),editText2.getText().toString());
        }

        textView1.setText(agenda.toString());

    }

}
