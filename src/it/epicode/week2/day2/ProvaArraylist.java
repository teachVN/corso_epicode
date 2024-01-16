package it.epicode.week2.day2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProvaArraylist {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        //int[] numeri = new int[3];
        /*
            Integer
            Byte
            Short
            Long
            Double
            Float
            Boolean
            Character


         */

        lista.add("Cagliari");
        lista.add("Empoli");
        lista.add("Sassuolo");
        lista.add("Udinese");

        String s = lista.get(3);
        System.out.println(s);

        System.out.println(lista.size());
        /*
        lista.clear();

        System.out.println(lista.size());


         */

        System.out.println(lista.indexOf("Udinese"));

        System.out.println(lista.remove("Cagliari"));

        System.out.println(lista.size());

        lista.set(0, "Parma");

        System.out.println(lista.get(0));

        //lista.set(3, "Cagliari");

        System.out.println(lista);

        Object[] parole = lista.toArray();

        String[] squadre = new String[5];

        lista.toArray(squadre);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for(String c:lista){
            System.out.println(c);
        }

        LinkedList<String> linkedList = new LinkedList<>();

        //linkedList.push();
    }
}
