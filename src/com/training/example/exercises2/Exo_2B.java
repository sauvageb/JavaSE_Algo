package com.training.example.exercises2;

import java.util.Scanner;

public class Exo_2B {

    public static void main(String[] args) {
        // Exercice 02B
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom");
        String nom = scanner.next();
        System.out.println("Bonjour " + nom);
        scanner.close();
    }
}
