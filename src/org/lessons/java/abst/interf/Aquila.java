package org.lessons.java.abst.interf;

import org.lessons.java.interfaces.Volatili;

public class Aquila extends Animale implements Volatili {

    @Override
    public void verso() {
        System.out.println("Verso dell'acquila");
    }

    @Override
    public void mangia() {
        System.out.println("Animali selvativi");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando!!!");
    }


}
