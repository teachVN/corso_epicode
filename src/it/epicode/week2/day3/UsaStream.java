package it.epicode.week2.day3;

import it.epicode.week2.day2.Articolo;

import java.util.List;
import java.util.stream.Stream;

public class UsaStream {

    public static void main(String[] args) {
        List<Integer> numeri = List.of(2,5,7,9,3);

        Stream<Integer> streamNumeri = numeri.stream();

        Stream<Integer> s1 = Stream.of(3,6,7,9,3);

        Stream<String> s2 = Stream.<String>builder().add("java").add("C").add("Javascript").add("Python").build();

        for(Integer i:numeri){
            if(i%2!=0){
                System.out.println(i);
            }
        }

        streamNumeri.filter(i->i%2!=0).forEach(i-> System.out.println(i));

        System.out.println(numeri.stream().filter(i->i%2!=0).count());

        System.out.println(numeri.stream().filter(i->i%2!=0 && i>3).sorted().toList());

        Articolo a1 = new Articolo("quaderno", "Consumabili", 1);
        Articolo a2 = new Articolo("penna", "Consumabili", 0.5);
        Articolo a3 = new Articolo("gomma", "Consumabili", 0.7);

        List<Articolo> listaArticoli = List.of(a1,a2,a3);

        System.out.println(listaArticoli.stream().filter(a->a.getPrezzo()<1).map(a->a.getPrezzo()).reduce(0.0,(somma,i)->somma+=i));

        System.out.println(listaArticoli.stream().filter(a->a.getPrezzo()<1).map(a->a.getPrezzo()).min((p1, p2)->(int)(p1-p2)));




    }
}
