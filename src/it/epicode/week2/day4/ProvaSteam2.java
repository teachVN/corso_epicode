package it.epicode.week2.day4;

import it.epicode.week2.day3.Product;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProvaSteam2 {

    public static void main(String[] args) {
        List<String> so = List.of("Windows", "Ios", "Android", "Linux", "Linux");

        //genera una lista a partire dallo stream
        List<String> so2 = so.stream().filter(s -> s.length()>4).collect(Collectors.toList());

        System.out.println(so2);

        //genera una lista immodificabile a partire dallo stream. Avremo una eccezione se cercheremo di modificarla
        List<String> so3 = so.stream().filter(s -> s.length()>4).collect(Collectors.toUnmodifiableList());

        //genera un set a partire dallo stream
        Set<String> soSet = so.stream().filter(s -> s.length()>4).collect(Collectors.toSet());

        System.out.println(soSet);

        //genera un set immodificabile a partire dallo stream
        Set<String> soSet2 = so.stream().filter(s -> s.length()>4).collect(Collectors.toUnmodifiableSet());

        //genera una lista specifica a partire dallo stream. Potremo creare ogni tipo di lista implementata
        LinkedList<String> so4 = so.stream().filter(s -> s.length()>4).collect(Collectors.toCollection(LinkedList::new));

        System.out.println(so4);

        //genera una Stringa concatenata ottenuta da tutte le stringhe dello stream
        String parola = so.stream().collect(Collectors.joining(", ", "SO: ", "."));

        System.out.println(parola);

        //genera un intero che risulta somma delle lunghezze di tutte le stringhe dello stream
        System.out.println(so.stream().collect(Collectors.summingInt(String::length)));

        //genera un intero che risulta la media delle lunghezze di tutte le stringhe dello stream
        System.out.println(so.stream().collect(Collectors.averagingInt(String::length)));

        //genera un oggetto di tipo IntSummaryStatistics che contiene informazioni statistiche di tutte le stringhe dello stream
        System.out.println(so.stream().collect(Collectors.summarizingInt(String::length)));

        //genera un intero che risulta il minimo delle lunghezze di tutte le stringhe dello stream
        System.out.println(so.stream().map(String::length).collect(Collectors.minBy(Comparator.naturalOrder())).get());

        //genera una mappa che ha come chiave le prime lettere di ogni parola e come valori il conteggio delle parole che cominciano con quelle lettere
        System.out.println(so.stream().collect(Collectors.groupingBy(s -> s.length(), Collectors.counting())));

        //genera una mappa che ha come chiave true o false in base alla condizione inserita e come valore il conteggio delle parole che verificano la condizione
        Map<Boolean,Long> mappa = so.stream().collect(Collectors.partitioningBy(s -> s.length()>3, Collectors.counting()));

        //uso del limit per limitare il numero di elementi all'interno dello stream
        System.out.println(so.stream().limit(2).collect(Collectors.toList()));

        //uso del mapToInt per effettuare delle operazioni aritmetiche su alcune caratteristiche dello stream
        System.out.println(so.stream().mapToInt(String::length).summaryStatistics());

        Product p1 = new Product(1L,"IPhone", "Smartphones", 2000.5);
        Product p2 = new Product(2L, "LOTR", "Books", 101.0);
        Product p3 = new Product(3L, "IT", "Books", 2.0);
        Product p4 = new Product(4L, "Da Vinci's Code", "Books", 2.0);
        Product p5 = new Product(5L, "Pampers", "Baby", 3.0);
        Product p6 = new Product(6L, "Car", "Boys", 15.0);
        Product p7 = new Product(7L,"Plane", "Boys", 25.0);
        Product p8 = new Product(8L,"Lego Star Wars", "Boys", 500.0);
        Product p9 = new Product(9L, "Pampers", "Baby", 3.0);

        List<Product> prodotti = List.of(p1, p2,p3,p4,p5,p6,p7);

        System.out.println(prodotti.stream().mapToDouble(Product::getPrice).max().getAsDouble());



    }
}
