package it.epicode.week1.day2;

import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parola;

        do{
            System.out.println("Dammi una stringa");
            parola = scanner.nextLine();

            if(!parola.equals(":q")){
                for(int i=0; i<parola.length(); i++){
                    System.out.print(parola.charAt(i));


                    if(i!=parola.length()-1)
                        System.out.print(",");

                }

                System.out.println();
            }

        } while(!parola.equals(":q"));
    }
}
