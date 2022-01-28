package com.training.example.exercises7;

public class Exo_7C {

    public static void main(String[] args) {
        int[] values = new int[]{1,2};
        displayArray(values);
    }

    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
