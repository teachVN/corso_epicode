package it.epicode.week2.day2;

import java.util.HashMap;
import java.util.Set;

public class ProvaHashMap {

    public static void main(String[] args) {
        HashMap<Integer, Articolo> inventario = new HashMap<>();

        Articolo a1 = new Articolo("quaderno", "Consumabili", 1);
        Articolo a2 = new Articolo("penna", "Consumabili", 0.5);
        Articolo a3 = new Articolo("gomma", "Consumabili", 1);

        inventario.put(1, a1);
        inventario.put(2, a2);
        inventario.put(3, a3);

        System.out.println(inventario.containsKey(4));

        Articolo a = inventario.get(1);

        System.out.println(a);



        Set<Integer> chiavi = inventario.keySet();

        for(Integer c:chiavi){
            Articolo articolo = inventario.get(c);

            if(articolo.equals(a3)){
                System.out.println(c);
            }
        }




    }
}
