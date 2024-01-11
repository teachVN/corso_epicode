package it.epicode.week1.day4;

public class GestioneDipendenti {

    public static void main(String[] args) {
        Dipendente d1 = new Dipendente(1, Dipartimento.PRODUZIONE);
        Dipendente d2 = new Dipendente(2,Dipartimento.PRODUZIONE);
        Dipendente d3 = new Dipendente(3,Dipendente.stipendioBase, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
        Dipendente d4 = new Dipendente(4, Dipendente.stipendioBase, 40, Livello.DIRIGENTE, Dipartimento.VENDITE);

        d1.promuovi();
        d3.promuovi();

        d1.stampaDatiDipendente();
        d2.stampaDatiDipendente();
        d3.stampaDatiDipendente();
        d4.stampaDatiDipendente();

        calcolaSommaStipendi(d1, d2, d3,d4);

    }

    public static void calcolaSommaStipendi(Dipendente d1, Dipendente d2, Dipendente d3, Dipendente d4){
        double sommaStipendi = Dipendente.calcolaPaga(d1, 5) + Dipendente.calcolaPaga(d2, 5) +
                Dipendente.calcolaPaga(d3, 5) + Dipendente.calcolaPaga(d4, 5);

        System.out.println(sommaStipendi);
    }
}
