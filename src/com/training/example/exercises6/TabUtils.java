package com.training.example.exercises6;

import java.util.Arrays;

public class TabUtils {

    private static String chaineTableau(int[] tableau) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tableau.length; i++) {

            sb.append(tableau[i]);
            if ((tableau.length > 1) && (i < tableau.length - 1))
                sb.append(",");

        }
        sb.append("]");
        return sb.toString();
    }

    public static void afficherTableau(int[] tableau) {
        System.out.println(chaineTableau(tableau));
    }

    private static String chaineTableau(String[] tableau) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tableau.length; i++) {

            sb.append(tableau[i]);
            if ((tableau.length > 1) && (i < tableau.length - 1))
                sb.append(",");

        }
        sb.append("]");
        return sb.toString();
    }

    public static void afficherTableau(String[] tableau) {
        System.out.println(chaineTableau(tableau));
    }

    public static int[] ajouterValeur(int valeur, int[] tableau) {
        int[] newTab = Arrays.copyOf(tableau, tableau.length + 1);
        newTab[newTab.length - 1] = valeur;
        return newTab;
    }

    public static String[] ajouterValeur(String valeur, String[] tableau) {
        String[] newTab = Arrays.copyOf(tableau, tableau.length + 1);
        newTab[newTab.length - 1] = valeur;
        return newTab;
    }

    public static int chercherValeurMax(int[] tableau) {
        int max = 0;
        for (int valeur : tableau) {
            if (valeur > max)
                max = valeur;
        }
        return max;
    }

    public static int chercherIndexValeurMax(int[] tableau) {
        int max = 0;
        int idx = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > max) {
                idx = i;
                max = tableau[i];
            }
        }
        return idx;
    }
}
