package org.lessons.java.abst.interf;

import org.lessons.java.interfaces.Nuotatori;

public class Delfino extends Animale implements Nuotatori {

    @Override
    public void verso() {
        System.out.println("Verso del delfino");
    }

    @Override
    public void mangia() {
        System.out.println("Pesci, Crostacei");
    }

    @Override
    public void swim() {
        System.out.println("Sto nuotando!!!");
    }


}
