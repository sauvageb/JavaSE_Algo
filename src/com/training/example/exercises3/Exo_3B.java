package com.training.example.exercises3;

import java.util.Scanner;

public class Exo_3B {

    public static void main(String[] args) {
        // Exercice 3B
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbA = scanner.nextInt();
        System.out.println("Veuillez saisir un autre nombre");
        int nbB = scanner.nextInt();

        int total = (nbA * nbB);
        if (total >= 0) {
            System.out.println(total + " est positif");
        } else {
            System.out.println(total + " est négatif");
        }
        scanner.close();
    }
}
