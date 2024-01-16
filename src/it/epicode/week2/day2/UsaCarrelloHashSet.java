package it.epicode.week2.day2;

public class UsaCarrelloHashSet {

    public static void main(String[] args) {
        CarrelloHashSet carrello = new CarrelloHashSet();

        Articolo a1 = new Articolo("quaderno", "Consumabili", 1);
        Articolo a2 = new Articolo("penna", "Consumabili", 0.5);
        Articolo a3 = new Articolo("gomma", "Consumabili", 1);
        Articolo a4 = new Articolo("penna", "Consumabili", 0.5);
        Articolo a5 = a4;

        System.out.println(a4.hashCode());
        System.out.println(a5.hashCode());


        carrello.aggiungiArticolo(a1);
        carrello.aggiungiArticolo(a2);
        carrello.aggiungiArticolo(a3);
        carrello.aggiungiArticolo(a4);

        carrello.stampaArticoli();

        System.out.println(carrello.totale());


    }
}
