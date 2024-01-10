package it.epicode.week1.day3;

public class Sim {

    private String numero;
    private double costoAlSecondo;
    private double credito;
    private String[] chiamate;
    private int chiamateDisponibili;

    public Sim(String numero, double costoAlSecondo){
        this.numero=numero;
        this.costoAlSecondo=costoAlSecondo;
        chiamate = new String[5];
    }

    public double getCostoAlSecondo() {
        return costoAlSecondo;
    }

    public double getCredito() {
        return credito;
    }

    public String getNumero() {
        return numero;
    }

    public String[] getChiamate() {
        return chiamate;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void stampaDatiSim(){
        System.out.println("Numero: " + numero + ", costo al secondo: " + costoAlSecondo + ", credito: " + credito);
    }

    public boolean telefonata(String numero, int secondi){
        double costoTelefonata = secondi*costoAlSecondo;

        if(costoTelefonata>credito){
            return false;
        }
        else{
            credito=credito-costoTelefonata;

            String datiChiamata = "Numero chiamato: " + numero + ", secondi di conversazione: " + secondi;

            if(chiamateDisponibili>0){
                chiamate[5-chiamateDisponibili]=datiChiamata;
            }
            else{

            }

        }

    }
}
