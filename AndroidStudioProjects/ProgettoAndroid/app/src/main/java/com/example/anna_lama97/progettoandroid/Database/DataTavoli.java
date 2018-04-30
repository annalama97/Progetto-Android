package com.example.anna_lama97.progettoandroid.Database;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;


/**
 * Classe che simula la sorgente dei dati
 */
public class DataTavoli {

    // Lista locale per simulare una ipotetica sorgente dati
    private Hashtable<String, Tavolo> elencoTavoli;

    // Unica instanza
    private static DataTavoli instance = null;

    // Costruttore privato
    private DataTavoli() {
        elencoTavoli = new Hashtable<>();
        Tavoliesempio();
    }

    /**
     * Ottiene il riferimento alla sorgente dati
     * @return restituisce l'instanza corrente
     */
    public static DataTavoli getInstance() {
        if (instance == null)
            instance = new DataTavoli();
        return instance;
    }


    public void addTavolo(Tavolo tavolo) {
        elencoTavoli.put(tavolo.getNumTav(), tavolo);
    }

    public void deleteTavolo(String numTav) {
        elencoTavoli.remove(numTav);
    }

    public List<Tavolo> getListaTavoli(boolean Bottone) {

        ArrayList<Tavolo> risultato = new ArrayList<Tavolo>();
        if(Bottone = true)
        for (Map.Entry<String, Tavolo> elemento: elencoTavoli.entrySet()) {
            if(elemento.getValue().isStatoTav() == true)
                risultato.add(elemento.getValue());
            }
         else {
            for (Map.Entry<String, Tavolo> elemento: elencoTavoli.entrySet()) {
                risultato.add(elemento.getValue());
            }
        }

        return risultato;
    }


    private void Tavoliesempio() {
        elencoTavoli.put("1", new Tavolo("1", 4, true));
        elencoTavoli.put("2", new Tavolo("2", 4, true));
        elencoTavoli.put("3", new Tavolo("3", 2, true));
        elencoTavoli.put("4", new Tavolo("4", 2, true));
        elencoTavoli.put("5", new Tavolo("5", 6, true));
        elencoTavoli.put("6", new Tavolo("6", 4, true));
        elencoTavoli.put("7", new Tavolo("7", 8, true));
        elencoTavoli.put("8", new Tavolo("8", 2, false));
    }

}

