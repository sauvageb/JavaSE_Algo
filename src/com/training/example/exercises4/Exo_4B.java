package com.training.example.exercises4;

import java.util.Scanner;

public class Exo_4B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int var = 0;
        do {
            System.out.println("Veuillez renseigner un nombre positif");
            var = scanner.nextInt();
        } while (var < 0);

        while (var > 0) {
            System.out.println(var);
            var--;
        }
    }
}
