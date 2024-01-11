package it.epicode.week1.day4;

public class UsaContrattoTelefonico {

    public static void main(String[] args) {
        ContrattoTelefonico cm = new ContrattoMobile(234234342, "Sara D'Agostino", 0.01, 0.1);

        ContrattoTelefonico cm2 = new ContrattoTelefonico(234234342, "Sara D'Agostino", 0.01);

        ContrattoMobile cm3 = (ContrattoMobile) cm;

        //((ContrattoMobile) cm).getCOSTO_ALLA_RISPOSTA();

        System.out.println(cm3.getCOSTO_ALLA_RISPOSTA());


        System.out.println(cm.getCostoTelefonate());
        System.out.println(cm.getNumeroTelefonate());

        cm.aggiornaBolletta(60);

        System.out.println(cm.getCostoTelefonate());
        System.out.println(cm.getNumeroTelefonate());

        cm.aggiornaBolletta(60);

        System.out.println(cm.getCostoTelefonate());
        System.out.println(cm.getNumeroTelefonate());

        System.out.println(cm);

        System.out.println(cm.stessoCostoAlSecondo(cm2));

        ContrattoTelefonico[] contratti = new ContrattoTelefonico[3];

        contratti[0]=cm;
        contratti[1]=cm2;
        contratti[2]=cm3;

        for (int i = 0; i < contratti.length ; i++) {
            contratti[i].aggiornaBolletta(10);
        }


    }
}
