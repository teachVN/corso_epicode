package it.epicode.week1.day2;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somma=0;
        int i=0;
        int numero;

        do{
            System.out.println("dammi un numero");
            numero = scanner.nextInt();
            somma += numero;
            i++;
        }while(numero!=0);

        System.out.println(somma/i);
    }
}
