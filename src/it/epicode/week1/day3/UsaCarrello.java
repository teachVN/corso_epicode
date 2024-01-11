package it.epicode.week1.day3;

public class UsaCarrello {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("433", "Roberto", "D'Amore", "dfsf@fdsfd.it", "");
        Articolo[] articoli = new Articolo[3];

        Articolo a1 = new Articolo("343", "matita", 0.5, 10);
        Articolo a2 = new Articolo("3421", "penna", 0.5, 10);
        Articolo a3 = new Articolo("6565", "gomma", 0.5, 3);

        articoli[0]=a1;
        articoli[1]=a2;
        articoli[2]=a3;

        Carrello carrello = new Carrello(cliente, articoli);

        System.out.println(carrello.costoCarrello());


    }
}
