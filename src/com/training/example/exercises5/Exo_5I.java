package com.training.example.exercises5;

public class Exo_5I {

    public static void main(String[] params) {
        int greaterValueAtIndex = 0;
        int[] tableau = {1, 100, 5, 20, 331, 87, 44, 11};

        for (int index = 0; index < tableau.length; index++) {
            if (tableau[index] > tableau[greaterValueAtIndex]) {
                greaterValueAtIndex = index;
            }
        }
        System.out.println("position :" + greaterValueAtIndex);
        System.out.println("value :" + tableau[greaterValueAtIndex]);

    }
}
