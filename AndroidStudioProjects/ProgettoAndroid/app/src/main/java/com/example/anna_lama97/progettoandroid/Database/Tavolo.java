package com.example.anna_lama97.progettoandroid.Database;

public class Tavolo {

    private String numTav;
    private int numPosti;
    private boolean statoTav;

    public Tavolo (String numTav, int numPosti, boolean statoTav){
        this.numTav = numTav;
        this.numPosti = numPosti;
        this.statoTav = statoTav;
    }

    public String getNumTav() {
        return numTav;
    }

    public void setNumTav(String numTav) {
        this.numTav = numTav;
    }

    public int getNumPosti() {
        return numPosti;
    }

    public void setNumPosti(int numPosti) {
        this.numPosti = numPosti;
    }

    public boolean isStatoTav() {
        return statoTav;
    }

    public void setStatoTav(boolean statoTav) {
        this.statoTav = statoTav;
    }
}
