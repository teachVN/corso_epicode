package it.epicode.week2.day2;

import java.util.ArrayList;

public class Carrello {

    private ArrayList<Articolo> carrello;

    public Carrello(){
        carrello = new ArrayList<>();
    }

    public void aggiungiArticolo(Articolo articolo){
        carrello.add(articolo);
    }

    public void stampaArticoli(){
        System.out.println(carrello);
    }

    public double totale(){
        double costoCarrello=0;

        for(Articolo articolo:carrello){
            costoCarrello += articolo.getPrezzo();
        }

        return costoCarrello;
    }



}
