package com.example.anna_lama97.progettoandroid;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.anna_lama97.progettoandroid.Database.Tavolo;



public class Menu extends AppCompatActivity {

    // Riferimenti alle view
    TextView vNumTav;
    TextView vNumPosti;
    TextView vLibero;


    // Chiave per il passaggio parametri alla activity di dettaglio
    private final String EXTRA_TAVOLO = "tavolo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dettaglio_tavolo);

        // Imposto i riferimenti alle view
        vNumTav = findViewById(R.id.textNumTav);
        vNumPosti = findViewById(R.id.textNumPosti);
        vLibero = findViewById(R.id.textLibero);


        // Ottengo i dati passati ed eventualmente visualizzo lo studente
        Intent intent = getIntent();
        Tavolo tavolo = (Tavolo) intent.getSerializableExtra(EXTRA_TAVOLO);

        if (tavolo != null) {
            vNumTav.setText(tavolo.getNumTav());
            vNumPosti.setText(tavolo.getNumPosti());
            vLibero.setEnabled(tavolo.isStatoTav());

        }
    }
}
