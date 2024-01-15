package it.epicode.week2.day1;

public class UsaMolo {

    public static void main(String[] args) {
        Molo m = Molo.crea("2342", 10);

        try {
            m.assegnaPostoBarca("caravella", 2);
            m.assegnaPostoBarca("Santa Maria", 2);
        }
        catch (PostoOccupatoException e){
            System.out.println(e);
        }


    }
}
