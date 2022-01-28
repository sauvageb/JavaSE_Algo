package com.training.example.exercises7;

import java.util.Random;
import java.util.Scanner;

public class Exo_7B {

    public static void main(String[] args) {
        // Chiffre aléatoire entre 0 et 5
        Scanner scanner = new Scanner(System.in);
        Random rn = new Random();
        int x = rn.nextInt(6);
        int val = 0;
        do {
            val = saisirValeur(scanner);
            if (val < x) {
                System.out.println("trop petit");
            }
            if (val > x) {
                System.out.println("trop grand");
            }
        } while (val != x);
        System.out.println("Trouvé !");

        scanner.close();
    }

    private static int saisirValeur(Scanner scanner) {
        System.out.println("Devine le nombre entre 0 et 5 :");
        return scanner.nextInt();
    }

}
