package it.epicode.week1.day2;

import java.util.Scanner;

public class Museo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli una opzione tra 1 e 4");
        int scelta = scanner.nextInt();
        /*
        if(scelta==1){
            System.out.println("biglietto gratuito");
        } else if (scelta==2) {
            System.out.println("costo biglietto 8€");
        } else if(scelta==3){
            System.out.println("costo biglietto 10€");
        } else if(scelta==4){
            System.out.println("costo biglietto 15€");
        } else{
            System.out.println("scelta errata");
        }*/

        switch (scelta){
            case 1,2:
                System.out.println("costo biglietto 8€");
                break;
            case 3:
                System.out.println("costo biglietto 10€");
                break;
            case 4:
                System.out.println("costo biglietto 15€");
                break;
            default:
                System.out.println("scelta errata");
        }
    }
}
