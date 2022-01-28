package com.training.example.exercises5;

import java.util.Arrays;
import java.util.Scanner;

public class Exo_5H {

    public static void main(String[] args) {
        //J'utilise le scanner
        Scanner saisieNombre = new Scanner(System.in);
        System.out.println("Nombre de valeur à saisir : ");
        // Informer le nombre de valeur a saisir
        int nbValeurASaisir = saisieNombre.nextInt();
        System.out.println("Veuillez saisir " + nbValeurASaisir + " valeurs :");
        // Création du tableau pour contenir les valeurs saisies
        int[] tableauValeurs = new int[nbValeurASaisir];
        // Boucle for, pour remplir le tableau index par index
        for (int i = 0; i < nbValeurASaisir; i++) {
            tableauValeurs[i] = saisieNombre.nextInt();
        }
        // Affichage du resultat
        System.out.println(Arrays.toString(tableauValeurs));

        System.out.println("Nombre le plus grand : " + nombreLePlusGrand(tableauValeurs));

    }

    private static int nombreLePlusGrand(int[] tableau){
        int nbPlusGrand = 0;
        for (int i = 0; i < tableau.length; i++) {
            if(tableau[i] > nbPlusGrand){
                nbPlusGrand = tableau[i];
            }
        }
        return nbPlusGrand;
    }

}
