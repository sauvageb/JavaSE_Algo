package com.training.example.exercises5;

import java.util.Scanner;

public class Exo_5C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nombre d'éléves : ");
        int nbEleve = scanner.nextInt();
        int[] tab = new int[nbEleve];

        int totalNotes = 0;

        // Ask mark for each students
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrez la note de l'éléve : " + (i + 1));
            int note = scanner.nextInt();
            tab[i] = note;
            totalNotes += note;
        }
        scanner.close();

        // Displaying all students with marks
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Eleve : " + (i + 1) + " -  note : " + tab[i]);
        }

        // Displaying students with average
        int moyenne = totalNotes / nbEleve;
        System.out.println("Moyenne = " + moyenne);
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > moyenne) {
                System.out.println("Eleve : " + (i + 1) + " -  note : " + tab[i]);
            }
        }


    }
}
