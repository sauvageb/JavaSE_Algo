package com.training.example.exercises2;

import java.util.Scanner;

public class Exo_2A {

    public static void main(String[] args) {
        // Exercice 02A
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le prix de votre objet :");
        double priceHT = scanner.nextDouble();

        System.out.println("Prix HT :" + priceHT);
        System.out.println("Prix TTC :" + priceHT * 1.20);
        scanner.close();
    }
}
