package it.epicode.week2.day3;

import java.util.List;

public class UsaLambda {

    public static void main(String[] args) {
        Sommatore sommatore = (a, b) -> a+b;

        System.out.println(sommatore.somma(4,7));

        Verificatore verificatore = (s, c)->s.length()>c;

        System.out.println(verificatore.verifica("corso java", 9));

        Cerchio c = x -> Math.PI*x*x;

        System.out.println(c.area(5));

        List<Double> lista = List.of(2.3,5.5,7.2,9.0,10.1,22.2);

        SommaLista sommaLista = l -> { double somma=0;
                                        for(Double d:l){
                                            somma+=d;
                                        }
                                        return somma;};

        System.out.println(sommaLista.sommaLista(lista));

    }
}
