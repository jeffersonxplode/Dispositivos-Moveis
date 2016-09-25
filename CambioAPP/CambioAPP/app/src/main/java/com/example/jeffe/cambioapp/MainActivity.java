package com.example.jeffe.cambioapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    Spinner moedas;
    private Button button;
    private EditText Valor;
    private EditText Resultado;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moedas = (Spinner) findViewById(R.id.spinner);
        Resultado = (EditText) findViewById(R.id.resultado);
        Valor = (EditText) findViewById(R.id.valor);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.s_moedas, android.R.layout.simple_spinner_item);
        moedas.setAdapter(adapter);
        button = (Button) findViewById(R.id.button);
        OnClickListener buttonListener = new OnClickListener() {
            @Override
            public void onClick(View v) {

                double valor = Double.parseDouble(Valor.getText().toString());
                String item = moedas.getSelectedItem().toString();

                if(valor == 0){

                    Toast.makeText(getApplicationContext(),"Digite um valor diferente de 0", Toast.LENGTH_SHORT).show();

                }
                else {

                    if (item.equals("Dolar Americano")) {

                        double total = valor / 3.2448;
                        Resultado.setText(String.format("%f", total));
                    } else if (item.equals("Peso Argentino")) {

                        double total = valor / 0.2140;
                        Resultado.setText(String.format("%f", total));

                    }
                }
            }
        };

        button.setOnClickListener(buttonListener);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
