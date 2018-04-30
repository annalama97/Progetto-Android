package com.example.anna_lama97.progettoandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.anna_lama97.progettoandroid.Database.Tavolo;

import org.w3c.dom.Text;

import java.util.List;



/**
 * Adapter per l'interfacciamento tra la listview degli studenti e la fonte dati
 */
public class TavoliAdapter extends BaseAdapter {

    private Context context;
    private List<Tavolo> elencoTavoli;


    public TavoliAdapter(Context context, List<Tavolo> elencoTavoli) {
        this.context = context;
        this.elencoTavoli = elencoTavoli;
    }

    // Invocato per ottenere il numero di elementi nella lista
    @Override
    public int getCount() {
        return elencoTavoli.size();
    }

    // Invocato per ottenere l'iesimo elemento
    @Override
    public Object getItem(int i) {
        return elencoTavoli.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    // Invocato per ottenere la view della riga da visualizzare
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // Nel caso il layout non sia stato iniettato, provvedo
        if (view == null)
            view = LayoutInflater.from(context).inflate(R.layout.menu_tavolo, null);

        // Ottengo gli ID correnti
       TextView vNumTav = view.findViewById(R.id.textNumTav);


        // Imposto i valori da visualizzare
        Tavolo t = elencoTavoli.get(i);
        vNumTav.setText(t.getNumTav());

        // Restituisco la view alla lista
        return view;
    }



    public void setElencoStudenti(List<Tavolo> elencoTavoli) {
        this.elencoTavoli = elencoTavoli;
        notifyDataSetChanged();
    }

}

//nviwjvpinv