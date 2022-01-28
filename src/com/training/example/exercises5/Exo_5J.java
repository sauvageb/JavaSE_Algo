package com.training.example.exercises5;

import java.util.Arrays;
import java.util.Scanner;

public class Exo_5J {

    public static void main(String[] params) {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[0];
        int maxValue = 0;
        int valueInput;
        do {
            System.out.println("Saisissez une valeur entrez un 0 pour arrêter");
            valueInput = sc.nextInt();

            if (valueInput > 0) {
                values = Arrays.copyOf(values, (values.length + 1));
                values[values.length - 1] = valueInput;
                if (valueInput > maxValue) maxValue = valueInput;
            }
        } while (valueInput != 0);
        System.out.println("Valeurs saisies : " + values);
        System.out.println("La valeur la plus grande est : " + maxValue);
    }


}
