package it.epicode.week1.day1;

import java.util.Scanner;

public class PrimaClasse {

    public static void main(String[] args){

        //scanner per farsi dare dati da un utente durante l'esecuzione del programma

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi un numero");

        int j = scanner.nextInt(); //metodo di scanner per farsi dare un int

        System.out.println(j);

        scanner.nextLine();

        System.out.println("Dammi una parola");

        String parola = scanner.nextLine(); //metodo di scanner per farsi dare una stringa

        System.out.println(parola.length()); //stringa.length per sapere quanto è lunga una stringa

        // questo è un commento su una riga

        /*
        commenti
        su
        più
        righe
         */

        /**
         *
         *
         *
         *
         *
         */

        //concatenamento stringhe

        String frase = "corso Java";

        String frase2 = "Epicode";

        String fraseConcatenata = frase + frase2;

        System.out.println(fraseConcatenata);


        //tipi primitivi


        int x;

        x=8;

        x=9;

        x=1;

        int y = 0;

        y = 7;

        final int r =6;

        boolean b = true;

        char c = 'e';

        byte w = 6;

        short s = 9;

        long l = 30000000;

        float f = 3.5f; //mettere la f vicino ad un numero decimale quando si crea un float

        double d = 3.6;




        //assegnazione tra variabili

        int z = s;

        float f2 = z;

        System.out.println(z);

        System.out.println(f2);

        //uso dell'operatore modulo per il resto di una divisione (utile quando vogliamo conoscere i valori multipli e pari e dispari)

        z = z%3;

        System.out.println(z);


        // post decremento per decrementare di 1
        z--;
        System.out.println(z);

        // post incremento per incrementare di 1
        z++;

        System.out.println(z);

        //richiamo del metodo somma che ha un ritorno

        double somma = somma(4,5);

        System.out.println(somma);

        //richiamo del metodo benvenuto che non ha un ritorno

        benvenuto("Silvia");

        benvenuto("Roberto");

    }

    //metodo somma che prende 2 parametri di ingresso e ritorno la somma dei 2 valori presi ingresso
    public static double somma(double x, double y){
        double somma = x+y;
        return somma;
    }


    //metodo benvenuto che prende un nome come parametro di ingresso e stampa una stringa
    public static void benvenuto(String nome){
        System.out.println("Benvenuto " + nome);
    }



}
