package com.training.example.exercises8;

public class Exo_8A {

    static void main(String[] args) {
        double ttc = calculerTVA(100, 20);
        System.out.println("Prix ttc = " + ttc);
    }

    static double calculerTVA(double ht, double tx) {
        return ht * (1 + (tx / 100));
    }
}
