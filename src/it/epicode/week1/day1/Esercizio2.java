package it.epicode.week1.day1;

import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Dammi la prima stringa");
        String s1 = scanner.next();

        System.out.println("Dammi la seconda stringa");
        String s2 = scanner.next();

        System.out.println("Dammi la terza stringa");
        String s3 = scanner.next();

        System.out.println(s1+s2+s3);

        System.out.println(s3+s2+s1);
        */

        String[] parole = new String[3];

        for(int i=0; i<parole.length; i++){
            System.out.println("Dammi la stringa");
            parole[i] = scanner.next();
        }

        for(int i=0; i< parole.length; i++){
            System.out.print(parole[i]);
        }

        System.out.println();

        for(int i=parole.length-1; i>=0; i--){
            System.out.print(parole[i]);
        }


    }


}
