package com.training.example.exercises3;

import java.util.Scanner;

public class Exo_3E {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'age d'un enfant : ");
        int age = scanner.nextInt();

        String categorie;
        switch (age) {
            case 6:
            case 7:
                categorie = "Poussin";
                break;
            case 8:
            case 9:
                categorie = "Pupille";
                break;
            case 10:
            case 11:
                categorie = "Minime";
                break;
            default:
                if (age < 6) {
                    categorie = "Trop petit !";
                } else
                    categorie = "Cadet";
        }
        System.out.println(categorie);
        scanner.close();
    }
}
