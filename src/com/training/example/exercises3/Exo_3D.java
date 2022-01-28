package com.training.example.exercises3;

import java.util.Scanner;

public class Exo_3D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nexercice3d\nEntrez un premier nombre");
        float number1 = scanner.nextFloat();

        System.out.println("Entrez un second nombre");
        float number2 = scanner.nextFloat();

        float product = number1 * number2;

        if (number1 == 0 || number2 == 0) {
            System.out.println("Le produit est nul");
        } else if (product < 0) {
            System.out.println("Le produit de " + number1 + " par " + number2 + " est négatif : " + product);
        } else {
            System.out.println("Le produit de " + number1 + " par " + number2 + " est positif : " + product);
        }
        scanner.close();
    }
}
