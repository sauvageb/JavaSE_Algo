package com.training.example.exercises5;

public class Exo_5F {

    public static void main(String[] args) {
        int[] array1 = {2,5,8,4};
        int[] array2 = {6,7};
        int total = 0;

        for (int i : array1) {
            for (int j : array2) {
                total = total + (i*j);
            }
        }
        System.out.println(total);

    }
}
