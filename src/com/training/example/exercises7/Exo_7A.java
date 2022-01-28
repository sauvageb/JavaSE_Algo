package com.training.example.exercises7;

import java.util.Scanner;

public class Exo_7A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println("Nb de mots dans la phrase : " + sentence.length());
        scanner.close();
    }
}
