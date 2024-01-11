package it.epicode.week1.day4;

public class UsaContrattoTelefonico {

    public static void main(String[] args) {
        ContrattoMobile cm = new ContrattoMobile(234234342, "Sara D'Agostino", 0.01, 0.1);

        System.out.println(cm.getCostoTelefonate());
        System.out.println(cm.getNumeroTelefonate());

        cm.aggiornaBolletta(60);

        System.out.println(cm.getCostoTelefonate());
        System.out.println(cm.getNumeroTelefonate());

        cm.aggiornaBolletta(60);

        System.out.println(cm.getCostoTelefonate());
        System.out.println(cm.getNumeroTelefonate());

    }
}
