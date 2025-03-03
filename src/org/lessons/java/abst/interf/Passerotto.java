package org.lessons.java.abst.interf;

import org.lessons.java.interfaces.Volatili;

public class Passerotto extends Animale implements Volatili {

    @Override
    public void verso() {
        System.out.println("Cip cip");
    }

    @Override
    public void mangia() {
        System.out.println("Insetti, Semi");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando!!!");
    }
    

}
