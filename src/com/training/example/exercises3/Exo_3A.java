package com.training.example.exercises3;

import java.util.Scanner;

public class Exo_3A {

    public static void main(String[] args) {
        // Exercice 3A
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println(number + " est positif");
        } else {
            System.out.println(number + " est négatif");
        }
        scanner.close();
    }
}
