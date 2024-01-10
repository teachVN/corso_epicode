package it.epicode.week1.day3;

public class Articolo {
    private String codice;
    private String descrizione;
    private double prezzo;
    private int pezzi;

    public Articolo(String codice, String descrizione, double prezzo, int pezzi){
        this.codice=codice;
        this.descrizione=descrizione;
        this.prezzo=prezzo;
        this.pezzi=pezzi;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getPezzi() {
        return pezzi;
    }

    public String getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
