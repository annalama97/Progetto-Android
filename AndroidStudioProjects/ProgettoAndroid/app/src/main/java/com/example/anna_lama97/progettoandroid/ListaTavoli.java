package com.example.anna_lama97.progettoandroid;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import com.example.anna_lama97.progettoandroid.Database.DataTavoli;
import com.example.anna_lama97.progettoandroid.Database.Tavolo;

public class ListaTavoli extends AppCompatActivity {
    // Riferimenti alle view
    private ListView vListaTavoli;
    private Switch vSwitchLibero;
    private TextView vTav;

    // Adapter e data source
    private TavoliAdapter adapter;
    private DataTavoli dataTavoli;

    // Chiave per il passaggio parametri alla activity di dettaglio
    private final String EXTRA_TAVOLO = "tavolo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_tavoli);

        vListaTavoli = findViewById(R.id.ListTavoli);
        vSwitchLibero = findViewById(R.id.textLibero);
        vTav = findViewById(R.id.textTav);

        dataTavoli = DataTavoli.getInstance();

        // Creo l'adapter
        adapter = new TavoliAdapter(this, dataTavoli.getListaTavoli(true));

        // Associo l'adapter alla listview
        vListaTavoli.setAdapter(adapter);

        // Imposto il listner per il click sulla listview
        vListaTavoli.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // E' stato selezionato una riga della lista: devo visualizzare i dettagli
                // sulla nuova activity

                // Ottengo dall'adapter lo studente da visualizzare
                Tavolo tavolo = (Tavolo) adapter.getItem(i);

                // Creo l'Intent per passare alla activity con il dettaglio
                Intent intent = new Intent(view.getContext(), Menu.class);

                intent.putExtra(EXTRA_TAVOLO, String.valueOf(tavolo));
                startActivity(intent);
            }
        });
    }
}
 //jdvdbjlb