package com.training.example.exercises4;

import java.util.Scanner;

public class Exo_4A {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Saisir un nombre entre 0 et 10");
        while (number < 0 || number > 10) {
            System.out.println("Raté ! Player plays again...");
            number = scanner.nextInt();
        }
        System.out.println("Enfin...");
    }
}
