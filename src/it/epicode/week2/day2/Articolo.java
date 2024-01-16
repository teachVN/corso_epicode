package it.epicode.week2.day2;

public class Articolo {

    private String titolo;
    private String categoria;
    private double prezzo;

    public Articolo(String titolo, String categoria, double prezzo) {
        this.titolo = titolo;
        this.categoria = categoria;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "titolo='" + titolo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
