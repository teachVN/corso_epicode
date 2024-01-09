package it.epicode.week1.day2;

import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi una parola");
        String parola = scanner.nextLine();

        boolean b = stringaPariDispari(parola);

        if(b){
            System.out.println("lunghezza della stringa pari");
        }
        else{
            System.out.println("lunghezza della stringa dispari");
        }

        System.out.println("Dammi un anno");
        int anno = scanner.nextInt();

        if(annoBisestile(anno)){
            System.out.println("anno bisestile");
        }
        else{
            System.out.println("anno non bisestile");
        }

    }

    public static boolean stringaPariDispari(String parola){
        if(parola.length()%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean annoBisestile(int anno){
        if((anno%4==0 && anno%100==0 && anno%400==0) || (anno%4==0 && anno%100!=0)){
            return true;
        }
        else{
            return false;
        }
    }


}
