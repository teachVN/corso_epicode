package it.epicode.week1.day4;

public class Dipendente {

    public final static double stipendioBase=1000;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        stipendio=stipendioBase;
        importoOrarioStraordinario=30;
        livello=Livello.OPERAIO;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void stampaDatiDipendente(){
        System.out.println(this);
    }

    public Livello promuovi(){
        switch (livello){
            case OPERAIO:
                livello=Livello.IMPIEGATO;
                stipendio=stipendioBase*1.2;
                break;
            case IMPIEGATO:
                livello=Livello.QUADRO;
                stipendio=stipendioBase*1.5;
                break;
            case QUADRO:
                livello=Livello.DIRIGENTE;
                stipendio=stipendioBase*2;
                break;
            case DIRIGENTE:
                System.out.println("Dirigente non promuovibile");
                break;
        }

        return livello;
    }

    public static double calcolaPaga(Dipendente d){
        return d.stipendio;
    }

    public static double calcolaPaga(Dipendente d, int oreStraordinario){
        return calcolaPaga(d) + oreStraordinario* d.importoOrarioStraordinario;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }
}
