package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        System.out.println("Rezultat je: " + saberiBrojeve(1, 2, 34, 34, 3));
        System.out.println("Rezultat je: " + saberiBrojeve());
        System.out.println("Rezultat je: " + saberiBrojeve(23,23,11,12,32,22.2));

    }
    /**
     * Ovde imamo primer varijabilne metode. Ova metoda moze da primi n double
     * vrednosti. Zatim prolazimo kroz sve double vrednosti koje su unete i
     * sabiramo ih. Povratna vrednost metode je rezultat sume.
     *
     * @param params
     * @return rezultat
     */
    private static double saberiBrojeve(double...params) {
        double rezultat =0;
        for(double i:params){
            rezultat +=i;
        }
        return rezultat;
    }


}
