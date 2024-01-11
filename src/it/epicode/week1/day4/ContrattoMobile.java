package it.epicode.week1.day4;

import it.epicode.week1.day4.ContrattoTelefonico;

public class ContrattoMobile extends ContrattoTelefonico {

    private final double COSTO_ALLA_RISPOSTA;

    public ContrattoMobile(int numeroTel, String utente, double COSTO_AL_SECONDO, double COSTO_ALLA_RISPOSTA){
        super(numeroTel, utente,COSTO_AL_SECONDO);
        this.COSTO_ALLA_RISPOSTA=COSTO_ALLA_RISPOSTA;
    }

    @Override
    public void aggiornaBolletta(int secondi){
        super.aggiornaBolletta(secondi);
        aggiungiCosti(COSTO_ALLA_RISPOSTA);

    }

    public double getCOSTO_ALLA_RISPOSTA() {
        return COSTO_ALLA_RISPOSTA;
    }
}
