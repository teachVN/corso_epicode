package it.epicode.week1.day3;

public class UsaRettangolo {

    public static void main(String[] args) {

        Rettangolo r1 = new Rettangolo(3,5);
        Rettangolo r2 = new Rettangolo(5, 7);

        stampaRettangolo(r1);
        stampaRettangolo(r2);
        stampaDueRettangoli(r1,r2);

    }

    public static void stampaRettangolo(Rettangolo r){
        System.out.println("Il perimetro del rettangolo è: " + r.perimetro());
        System.out.println("L'area del rettangolo è: " + r.area());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        System.out.println("Area e perimetro del primo rettangolo");
        stampaRettangolo(r1);

        System.out.println("Area e perimetro del secondo rettangolo");
        stampaRettangolo(r2);

        double areaTotale = r1.area()+r2.area();
        double perimetroTotale = r1.perimetro()+r2.perimetro();

        System.out.println("La somma dei perimetri è: " + perimetroTotale);
        System.out.println("La somma delle aree è: " + areaTotale);
    }
}
