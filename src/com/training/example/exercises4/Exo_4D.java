package com.training.example.exercises4;

import java.util.Scanner;

public class Exo_4D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int resultat = 0;
        int i = 1;

        for (; i < number; i++) {
            System.out.print(i + "+");
            resultat = resultat + i;
        }
        System.out.print(i);
        resultat = resultat + number;
        System.out.println(" = " + resultat);
    }
}
