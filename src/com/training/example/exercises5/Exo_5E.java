package com.training.example.exercises5;

import java.util.Arrays;

public class Exo_5E {

    public static void main(String[] args) {
        int[] array1 = {4,8,7,9,1,5,4,6};
        int[] array2 = {7,6,5,2,1,3,7,4};
        int[] array3 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] + array2[i];
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }
}
