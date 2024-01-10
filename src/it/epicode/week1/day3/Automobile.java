package it.epicode.week1.day3;

public class Automobile {

    private int cilindrata;
    private String marca;
    private String nome;
    private String targa;
    private int porte;

    private TipoAutomobile categoria;

    public Automobile(String marca, String nome, String targa, int cilindrata, int porte){
        this.marca=marca;
        this.nome=nome;
        this.targa=targa;
        this.cilindrata=cilindrata;
        this.porte=porte;
    }

    public Automobile(String marca, String nome, String targa, int cilindrata){
        this.marca=marca;
        this.nome=nome;
        this.targa=targa;
        this.cilindrata=cilindrata;

    }

    public Automobile(){

    }

    public Automobile(int porte){

    }


    public void accelera(){
        System.out.println("sto accelerando");
    }

    public void decelera(){
        System.out.println("sto rallentando");
    }

    public void stampaCaratteristiche(){
        System.out.println("cilindrata: " + cilindrata + ", marca: " + marca + ", nome: " + nome +
                ", porte: " + porte + ", targa: " + targa + ", categoria: " + categoria);
    }

}
