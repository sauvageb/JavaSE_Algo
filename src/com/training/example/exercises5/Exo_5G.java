package com.training.example.exercises5;

import java.util.Arrays;
import java.util.Scanner;

public class Exo_5G {

    public static void main(String[] args) {
        //J'utilise le scanner
        Scanner saisieNombre = new Scanner(System.in);

        // Demande le nombre de valeur a saisir
        System.out.println("Nombre de valeur à saisir : ");
        int nbValeurASaisir = saisieNombre.nextInt();
        System.out.println("Veuillez saisir " + nbValeurASaisir + "valeurs :");

        // Création du tableau pour contenir les valeurs saisies
        int[] tableauValeurs = new int[nbValeurASaisir];

        // Boucle for, pour remplir le tableau index par index et +1
        for (int i = 0; i < nbValeurASaisir; i++) {
            tableauValeurs[i] = saisieNombre.nextInt() + 1;
        }
        // Affichage du resultat
        System.out.println(Arrays.toString(tableauValeurs));

    }
}
