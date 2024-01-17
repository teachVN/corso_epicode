package it.epicode.week2.day3;

public class UsaLambda {

    public static void main(String[] args) {
        Sommatore sommatore = (a, b) -> a+b;

        System.out.println(sommatore.somma(4,7));

        Verificatore verificatore = (s, c)->s.length()>c;

        System.out.println(verificatore.verifica("corso java", 9));

        Cerchio c = x -> Math.PI*x*x;

        System.out.println(c.area(5));


    }
}
