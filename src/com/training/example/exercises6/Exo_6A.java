package com.training.example.exercises6;

public class Exo_6A {

    public static void main(String[] args) {
        int[][] array = {{0, 18}, {1, 45}, {45, 48}, {-3, 2}};

        int greaterValue = 0;

        System.out.println("Les valeurs du tableau sont :");
        for (int[] column : array) {
            for (int y = 0; y < column.length; y++) {
                System.out.print(column[y] + " ");

                if (greaterValue < column[y]) {
                    greaterValue = column[y];
                }
            }
            System.out.println();
        }
        System.out.println("La valeur la plus grande est : " +  greaterValue);
    }
}
