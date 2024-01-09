package it.epicode.week1.day2;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int[] numeri = new int[10];

        int i=0;

        int somma = 0;

        while(i<numeri.length){
            System.out.println("Dammi un numero");
            numeri[i]=scanner.nextInt();
            i++;
        }

        for(int j=0; j<numeri.length; j++){
            somma += numeri[j];
        }

        double media = (double)somma/numeri.length;
*/

        int i=0;
        double somma=0;

        while(i<10){
            System.out.println("Dammi un numero");
            somma += scanner.nextInt();
            i++;
        }

        double media = somma/10;

        System.out.println(media);



    }
}
