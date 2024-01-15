package it.epicode.week2.day1;

import java.sql.SQLException;

public class UsaAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();

        try {
            System.out.println(aritmetica.divisione(5, 0));
        }

        catch (ArithmeticException e){
            System.out.println("Divisione per 0 non ammessa");
        }
        catch (Exception e){

        }
        finally {

        }


        System.out.println("programma finito");
    }
}
