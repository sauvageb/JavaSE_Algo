package com.training.example.exercises5;

public class Exo_5A {

    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 15, 14, 8};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum); // 82
    }
}
