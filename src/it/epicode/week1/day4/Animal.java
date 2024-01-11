package it.epicode.week1.day4;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs=legs;
    }

    public void walk(){
        System.out.println("the animal walk");
    }

    public abstract void eat();
}
