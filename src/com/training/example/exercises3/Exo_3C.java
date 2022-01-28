package com.training.example.exercises3;

import java.util.Scanner;

public class Exo_3C {

    public static void main(String[] args) {
        System.out.println("Saisissez trois mots");
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        String thirdWord = scanner.nextLine();

        if (firstWord.compareToIgnoreCase(secondWord) < 0 && secondWord.compareToIgnoreCase(thirdWord) < 0) {
            System.out.println("Les 3 mots sont rangés par ordre alpha");
        } else {
            System.out.println("Les mots ne sont pas ordonnés");
        }
    }
}
