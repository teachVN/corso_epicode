package it.epicode.week2.day3;

import java.util.List;
@FunctionalInterface
public interface SommaLista {

    public double sommaLista(List<Double> numeri);

    public default void stampa(){
        System.out.println("ciao");
    }
}
