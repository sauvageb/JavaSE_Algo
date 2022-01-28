package com.training.example.exercises1;

public class Exo_1B {

    public static void main(String[] params) {
        int a = 12;
        int b = 2;

        System.out.println(a);
        System.out.println(b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println(b);
        System.out.println(a);
    }
}
