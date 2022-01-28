package com.training.example.exercises5;

import java.util.Scanner;

public class Exo_5B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nombre d'éléves : ");
        int nbEleve = scanner.nextInt();
        int[] tab = new int[nbEleve];

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrez la note de l'éléve : " + (i + 1));
            int note = scanner.nextInt();
            tab[i] = note;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Eleve : " + (i + 1) + " -  note : " + tab[i]);
        }

        scanner.close();


    }
}
