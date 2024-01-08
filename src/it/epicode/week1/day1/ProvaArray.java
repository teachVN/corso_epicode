package it.epicode.week1.day1;

import java.util.Scanner;

public class ProvaArray {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //creazione array di interi vuoto (tutti zeri) di dimensione 5
        int[] numeri = new int[5];


        //ciclo per popolare l'array facendosi dare i dati dall'utente
        for(int i=0; i<numeri.length; i++){
            System.out.println("Dammi un numero");
            numeri[i] = scanner.nextInt();
        }


        //ciclo per stampare il contenuto dell'array
        for(int i=0; i<numeri.length; i++){
            System.out.println(numeri[i]);
        }

        //creazione di un array di stringhe già popolato
        String[] giorniSettimana = {"lunedì", "martedì", "mercoledì", "giovedì", "venerdì", "sabato", "domenica"};


        //ciclo per stampare il contenuto dell'array
        for(int i=0; i<giorniSettimana.length; i++){
            System.out.println(giorniSettimana[i]);
        }


    }

}
