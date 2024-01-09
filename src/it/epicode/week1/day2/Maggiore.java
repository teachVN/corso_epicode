package it.epicode.week1.day2;

import java.util.Scanner;

public class Maggiore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi il primo valore");
        int a = scanner.nextInt();

        System.out.println("Dammi il secondo valore");
        int b = scanner.nextInt();

        System.out.println("Dammi il terzo valore");
        int c = scanner.nextInt();

        int maggiore = maggiore(a, b, c);

        System.out.println(maggiore);

    }

    public static int maggiore(int n1, int n2, int n3){
        /*
        if(n1>=n2 && n1>=n3){
            return n1;
        }
        else if(n2>=n1 && n2>=n3){
            return n2;
        }
        else{
            return n3;
        }*/

        int max;

        if(n1>n2){
            max=n1;
        }
        else{
            max=n2;
        }

        if(max<n3){
            max=n3;
        }

        return max;


    }

}
