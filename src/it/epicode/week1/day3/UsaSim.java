package it.epicode.week1.day3;

public class UsaSim {

    public static void main(String[] args) {
        Sim sim = new Sim("23987123", 0.01);

        sim.setCredito(2);

        System.out.println(sim.telefonata("879879", 30));
        System.out.println(sim.telefonata("87934534", 60));
        System.out.println(sim.telefonata("873232322", 30));
        System.out.println(sim.telefonata("87934534", 30));
        System.out.println(sim.telefonata("87934534", 10));
        System.out.println(sim.telefonata("87934534", 10));

        sim.stampaDatiSim();
    }
}
