package org.lessons.java.abst.interf;

import org.lessons.java.interfaces.Nuotatori;

public class Cane extends Animale implements Nuotatori {

    @Override
    public void verso() {
        System.out.println("Bau bau");
    }

    @Override
    public void mangia() {
        System.out.println("Carne, Croccantini");
    }

    @Override
    public void swim() {
        System.out.println("Sto nuotando!!!");
    }

}
