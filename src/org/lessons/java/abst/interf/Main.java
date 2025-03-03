package org.lessons.java.abst.interf;

import org.lessons.java.interfaces.Nuotatori;
import org.lessons.java.interfaces.Volatili;

public class Main {

    static void faiVolare(Volatili animale) {
        animale.fly();
    }

    static void faiNuotare(Nuotatori animale) {
        animale.swim();
    }
    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("Cane:");
        Cane fufi = new Cane();
        fufi.dormi();
        fufi.verso();
        fufi.mangia();

        System.out.println("---------------------------");
        System.out.println("Passerotto:");
        Passerotto passy = new Passerotto();
        passy.dormi();
        passy.verso();
        passy.mangia();

        System.out.println("---------------------------");
        System.out.println("Aquila:");
        Aquila aquy = new Aquila();
        aquy.dormi();
        aquy.verso();
        aquy.mangia();

        System.out.println("---------------------------");
        System.out.println("Delfino:");
        Delfino delph = new Delfino();
        delph.dormi();
        delph.verso();
        delph.mangia();

        System.out.println("---------------------------");
        System.out.println("Vola & Nuota:");
        faiNuotare(fufi);
        faiVolare(passy);
        faiVolare(aquy);
        faiNuotare(delph);

    }
}
