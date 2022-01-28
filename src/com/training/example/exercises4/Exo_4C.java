package com.training.example.exercises4;

import java.util.Scanner;

public class Exo_4C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int solution = 42;
        int value;

        do {
            System.out.println("Quel est le juste prix ?");
            value = scanner.nextInt();
            if (value > solution) {
                System.out.println("C'est Moins !");
            } else if (value < solution) {
                System.out.println("C'est Plus !");
            } else {
                System.out.println("C'est gagné !");
            }
        } while (value != solution);

        scanner.close();
    }
}
