package org.lessons.java.abst.interf;

public class Main {
    public static void main(String[] args) {
        Cane fufi = new Cane();
        fufi.dormi();
        fufi.verso();
        fufi.mangia();

        System.out.println("---------------------------");
        Passerotto passy = new Passerotto();
        passy.dormi();
        passy.verso();
        passy.mangia();

        System.out.println("---------------------------");
        Aquila aquy = new Aquila();
        aquy.dormi();
        aquy.verso();
        aquy.mangia();

        System.out.println("---------------------------");
        Delfino delph = new Delfino();
        delph.dormi();
        delph.verso();
        delph.mangia();
    }
}
