package it.epicode.week1.day3;

public class Carrello {

    private Cliente cliente;
    private Articolo[] articoli;

    public Carrello(Cliente cliente, Articolo[] articoli){
        this.cliente=cliente;
        this.articoli=articoli;
    }

    public double costoCarrello(){
        double costoTotale=0;

        for(int i=0; i< articoli.length; i++){
            costoTotale+=(articoli[i].getPrezzo()*articoli[i].getPezzi());
        }
        return costoTotale;
    }


}
