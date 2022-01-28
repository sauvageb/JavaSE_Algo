package com.training.example.exercises5;

import java.util.Scanner;

public class Exo_5D {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nombreEleve = saisirNombreEleves();
        int[] tableauNotes = creerTableauNotes(nombreEleve);
        saisirNotes(tableauNotes);
        afficherToutesLesNotes(tableauNotes);
        afficherNotesInferieur8(tableauNotes);
        afficherNotesSuperieur10(tableauNotes);
        afficherNotesSuperieur15(tableauNotes);
        afficherMoyenne(tableauNotes);
        scanner.close();
    }

    private static int saisirNombreEleves() {
        System.out.println("Entrez le nombre d'éléves : ");
        return scanner.nextInt();
    }

    private static int[] creerTableauNotes(int nbEleve) {
        return new int[nbEleve];
    }

    private static void saisirNotes(int[] tableau) {

        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Entrez la note de l'éléve : " + (i + 1));
            int note = scanner.nextInt();
            tableau[i] = note;
        }
    }

    private static int calculerSommeNotes(int[] tableau) {
        int somme = 0;
        for (int j : tableau) {
            somme = somme + j;
        }
        return somme;
    }

    private static double calculerMoyenne(int[] tableau) {
        int somme = calculerSommeNotes(tableau);
        return somme / tableau.length;
    }

    private static String chaineMoyenne(int[] tableau) {
        return "La moyenne est de : " + calculerMoyenne(tableau) + "\n";
    }

    private static String chaineNotes(int[] tableau) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tableau.length; i++) {
            sb.append("Eleve : " + (i + 1) + ", note : " + tableau[i] + "\n");
        }
        return sb.toString();
    }

    private static String chaineNotesInferieur(int[] tableau, int limite) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < limite)
                sb.append("Eleve : " + (i + 1) + ", note : " + tableau[i] + "\n");
        }
        return sb.toString();
    }

    private static String chaineNotesSuperieur(int[] tableau, int limite) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > limite)
                sb.append("Eleve : " + (i + 1) + ", note : " + tableau[i] + "\n");
        }
        return sb.toString();
    }

    private static void afficherToutesLesNotes(int[] tableau) {
        System.out.println("Toutes les notes :");
        System.out.println(chaineNotes(tableau));
    }

    private static void afficherNotesInferieur8(int[] tableau) {
        System.out.println("Notes inférieures à 8 :");
        System.out.println(chaineNotesInferieur(tableau, 8));
    }

    private static void afficherNotesSuperieur10(int[] tableau) {
        System.out.println("Notes supérieures à 10 :");
        System.out.println(chaineNotesSuperieur(tableau, 10));
    }

    private static void afficherNotesSuperieur15(int[] tableau) {
        System.out.println("Notes supérieures à 15 :");
        System.out.println(chaineNotesSuperieur(tableau, 15));
    }

    private static void afficherMoyenne(int[] tableau) {
        System.out.println("Moyenne : " + chaineMoyenne(tableau));
    }
}
