package com.training.example.exercises6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo_6B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] tableauDesEleves = {};
        String note;
        String prenom;
        while (continuer(note = saisirValeur("note", scanner)) &&
                continuer(prenom = saisirValeur("prenom", scanner))) {
            String[] tableauEleve = creerTableauNotePrenom(note, prenom);
            tableauDesEleves = ajouterEleve(tableauDesEleves, tableauEleve);
        }
        scanner.close();
        afficherTableauDesEleves(tableauDesEleves);
    }

    private static String saisirValeur(String label, Scanner scanner) {
        System.out.println("Entrez un(e) " + label + " : ");
        return scanner.next();
    }

    private static boolean continuer(String valeur) {
        return !valeur.equals("-1");
    }

    private static String[] creerTableauNotePrenom(String note, String prenom) {
        String[] newTab = new String[2];
        newTab[0] = note;
        newTab[1] = prenom;
        return newTab;
    }

    private static String[][] ajouterEleve(String[][] tableauEleve, String[] tableauNotePrenom) {
        String[][] newTab = new String[tableauEleve.length + 1][];
        for (int i = 0; i < tableauEleve.length; i++) {
            newTab[i] = Arrays.copyOf(tableauEleve[i], tableauEleve[i].length);
        }
        newTab[newTab.length - 1] = Arrays.copyOf(tableauNotePrenom, tableauNotePrenom.length);
        return newTab;
    }

    private static void afficherTableauDesEleves(String[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            TabUtils.afficherTableau(tableau[i]);
        }
    }


}
