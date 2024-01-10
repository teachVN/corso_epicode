package it.epicode.week1.day3;

public class Rettangolo {

    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza){
        this.altezza=altezza;
        this.larghezza=larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double perimetro(){
        return (altezza+larghezza)*2;
    }

    public double area(){
        return altezza*larghezza;
    }
}
