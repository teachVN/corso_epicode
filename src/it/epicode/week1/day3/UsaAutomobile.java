package it.epicode.week1.day3;

public class UsaAutomobile {

    public static void main(String[] args) {
        Automobile auto = new Automobile("Fiat", "500", "AZ3432", 1500, 3);
        /*
        auto.cilindrata=1500;
        auto.marca="Fiat";
        auto.nome="500";
        auto.porte=3;
        auto.targa="AZ3432";
        */

       // auto.=TipoAutomobile.SUV;

        auto.stampaCaratteristiche();

        auto.accelera();

        auto.decelera();

        Automobile auto2 = new Automobile("Fiat", "500", "AZ3432", 1500, 5);

        auto2.stampaCaratteristiche();

        Automobile auto3 = auto;

        //System.out.println(auto3.cilindrata);

        //auto3.cilindrata=1700;

        //System.out.println(auto.cilindrata);

        System.out.println(auto==auto2);

        System.out.println(auto==auto3);

        System.out.println(auto.equals(auto2));

        System.out.println(auto.equals(auto3));


    }
}
