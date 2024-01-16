package it.epicode.week2.day2;

public class UsaCarrello {

    public static void main(String[] args) {
        Carrello carrello = new Carrello();

        Articolo a1 = new Articolo("quaderno", "Consumabili", 1);
        Articolo a2 = new Articolo("penna", "Consumabili", 0.5);
        Articolo a3 = new Articolo("gomma", "Consumabili", 1);

        carrello.aggiungiArticolo(a1);
        carrello.aggiungiArticolo(a2);
        carrello.aggiungiArticolo(a3);
        carrello.aggiungiArticolo(a2);

        carrello.stampaArticoli();

        System.out.println(carrello.totale());


    }
}
