package it.epicode.week2.day2;

import java.util.ArrayList;
import java.util.HashSet;

public class CarrelloHashSet {

    private HashSet<Articolo> carrello;

    public CarrelloHashSet(){
        carrello = new HashSet<>();
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
