package it.epicode.week2.day3;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Product p1 = new Product(1L, "IPhone", "Smartphones", 2000.5);
        Product p2 = new Product(2L, "LOTR", "Books", 101.0);
        Product p3 = new Product(3L, "IT", "Books", 2.0);
        Product p4 = new Product(4L, "Da Vinci's Code", "Books", 2.0);
        Product p5 = new Product(5L, "Pampers", "Baby", 3.0);
        Product p6 = new Product(6L, "Car", "Boys", 15.0);
        Product p7 = new Product(7L, "Plane", "Boys", 25.0);
        Product p8 = new Product(8L, "Lego Star Wars", "Boys", 500.0);
        Product p9 = new Product(9L, "Pampers", "Baby", 3.0);

        Customer roberto = new Customer(1L, "Roberto Iloi", 1);
        Customer giovanni = new Customer(2L, "Giovanni Storti", 2);
        Customer giacomo = new Customer(3L, "Giacomo Poretti", 3);
        Customer francesca = new Customer(4L, "Francesca Aone", 2);

        Order robertoOrder = new Order(1L, "insert", LocalDate.of(2021, 1, 1), roberto);
        Order giovanniOrder = new Order(2L, "insert", LocalDate.of(2021, 3, 1), giovanni);
        Order giacomoOrder = new Order(3L, "insert", LocalDate.of(2021, 3, 10), giacomo);
        Order francescaOrder = new Order(4L, "insert", LocalDate.of(2021, 2, 10), francesca);
        Order giacomoOrder2 = new Order(5L, "insert", LocalDate.of(2021, 5, 1), giacomo);

        List<Product> listaProdotti = List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9);

        List<Customer> listaCustomer = List.of(roberto, giovanni, giacomo, francesca);

        List<Order> listaOrdini = List.of(robertoOrder, giovanniOrder, giacomoOrder2, giacomoOrder, francescaOrder);

        robertoOrder.addProduct(p1);
        robertoOrder.addProduct(p2);
        robertoOrder.addProduct(p3);

        giovanniOrder.addProduct(p4);
        giovanniOrder.addProduct(p5);
        giovanniOrder.addProduct(p6);

        giacomoOrder2.addProduct(p7);
        giacomoOrder2.addProduct(p8);
        giacomoOrder2.addProduct(p9);

        francescaOrder.addProduct(p1);
        francescaOrder.addProduct(p4);
        francescaOrder.addProduct(p5);

        /*
        List<Product> listaEsercizio1 = listaProdotti.stream().filter(product -> product.getCategory().equals("Books") && product.getPrice() > 1).toList();
        System.out.println(listaEsercizio1);

        List<Order> listaEsercizio2 = listaOrdini.stream().filter(order -> order.getProducts().contains(p5)).toList();

        System.out.println(listaEsercizio2);

        List<Product> listaEsercizio3 = listaProdotti.stream().filter(product -> product.getCategory().equals("Baby")).map(product -> {
            product.setPrice(product.getPrice() * 0.9);
            return product;
        }).toList();

        System.out.println(listaEsercizio3);

        List<Product> listaEsercizio4 = listaOrdini.stream().filter(order -> order.getCustomer().getTier() == 2 && order.getOrderDate().isAfter(LocalDate.of(2021, 2, 1)) && order.getOrderDate().isBefore(LocalDate.of(2021, 4, 1))).map(order -> order.getProducts()).flatMap(list -> list.stream()).distinct().toList();

        System.out.println(listaEsercizio4);


        Map<Customer, List<Order>> map3 = listaOrdini.stream().collect(Collectors.groupingBy(Order::getCustomer));
        System.out.println(map3.size());*/

        //Esercizio 1
        Map<Customer, List<Order>> mappaCustomerOrdini = listaOrdini.stream().collect(Collectors.groupingBy(Order::getCustomer));

        System.out.println(mappaCustomerOrdini);

        //Esercizio 2
        Map<Customer, Double> mappaCustomerSommaOrdini = listaOrdini.stream().
                collect(Collectors.groupingBy(Order::getCustomer,
                                Collectors.summingDouble(o -> o.getProducts().stream().
                                        mapToDouble(Product::getPrice).sum())));

        System.out.println(mappaCustomerSommaOrdini);

        //Esercizio 3
        Product p = listaProdotti.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))).get();

        System.out.println(p);

        //Esercizio 4
        Double media = listaOrdini.stream().mapToDouble(o->o.getProducts().stream().mapToDouble(Product::getPrice).sum()).average().getAsDouble();

        System.out.println(media);

        //Esercizio 5
        Map<String, Double> mappaCategoriaImportiProdotti = listaProdotti.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.summingDouble(Product::getPrice)));

        System.out.println(mappaCategoriaImportiProdotti);


    }

/*
        System.out.println(map3.get(giacomo));

        System.out.println(listaOrdini.stream().collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(o->o.getProducts().stream().mapToDouble(Product::getPrice).sum()))));

        System.out.println(listaProdotti.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))).get());

        System.out.println(listaOrdini.stream().mapToDouble(o->o.getProducts().stream().mapToDouble(Product::getPrice).sum()).average());

        System.out.println(listaProdotti.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.summingDouble(Product::getPrice))));

    }

    public static void salvaProdottisuDisco(List<Product> prodotti) throws IOException {
        File file = new File("listaProdotti.txt");

        String lista = prodotti.stream().map(p->p.getName()+"@"+p.getCategory()+"@"+p.getPrice()).collect(Collectors.joining("#"));
        FileUtils.writeStringToFile(file, lista, Charset.defaultCharset(), true);


    }

    public static ArrayList<Product> leggiProdottiDaDisco() throws IOException {
        File file = new File("listaProdotti.txt");

        String lista = FileUtils.readFileToString(file, Charset.defaultCharset());

        String[] stringheProdotti = lista.split("#");
    }*/

    public static void salvaProdottiSuDisco(List<Product> prodotti) throws IOException {
        File file = new File("dirProdotti/prodotti.txt");

        String stringaProdotti = prodotti.stream().map(p->p.getName()+"@"+p.getCategory()+"@"+p.getPrice()).collect(Collectors.joining("#"));

        FileUtils.writeStringToFile(file, stringaProdotti, Charset.defaultCharset(), true);

    }

    public static ArrayList<Product> leggiProdottiDaDisco() throws IOException {
        File file = new File("dirProdotti/prodotti.txt");

        String stringaProdotti =  FileUtils.readFileToString(file, Charset.defaultCharset());

        String[] stringheSingoloProdotto = stringaProdotti.split("#");


        ArrayList<Product> prodotti = Arrays.stream(stringheSingoloProdotto).map(s -> {String[] stringaCaratteristicheProdotto = s.split("@");
                                                           Product p = new Product(new Random().nextLong(),
                                                                   stringaCaratteristicheProdotto[0],
                                                                   stringaCaratteristicheProdotto[1],
                                                                   Double.parseDouble(stringaCaratteristicheProdotto[2]));
                                                           return p;}).collect(Collectors.toCollection(ArrayList::new));
        return prodotti;

    }
}
