package org.lessons.java.abst.interf;

public class Passerotto extends Animale {

    @Override
    public void verso() {
        System.out.println("Cip cip");
    }

    @Override
    public void mangia() {
        System.out.println("Insetti, Semi");
    }

}
