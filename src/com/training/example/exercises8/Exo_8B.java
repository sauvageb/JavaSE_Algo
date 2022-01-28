package com.training.example.exercises8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exo_8B {

    static class Student {
        String name;
        Float mark;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        System.out.println("Combien de notes devez-vous saisir ?");
        int nbMarks = scanner.nextInt();
        System.out.println("Saisir les notations :");
        for (int i = 0; i < nbMarks; i++) {
            Student newStudent = new Student();

            System.out.println("Nom de l'étudiant :");
            newStudent.name = scanner.next();
            if (newStudent.name.contains("-1")) break;

            System.out.println("Note de l'étudiant :");
            newStudent.mark = scanner.nextFloat();
            if (newStudent.mark == -1) break;

            studentList.add(newStudent);
        }
        // all marks
        System.out.println("Les informations saisies sont :");
        studentList.forEach(student -> {
            System.out.println("Nom : " + student.name + ", Note : " + student.mark);
        });

        // marks < 8
        System.out.println("Notes < 8 :");
        studentList
                .stream()
                .filter(student -> student.mark < 8)
                .forEach(student -> System.out.println("Nom : " + student.name + ", Note : " + student.mark));

        // marks > 10
        System.out.println("Notes > 8 :");
        studentList
                .stream()
                .filter(student -> student.mark > 10)
                .forEach(student -> {
                    System.out.println("Nom : " + student.name + ", Note : " + student.mark);
                });

        // marks > 15
        System.out.println("Notes > 15 :");
        studentList
                .stream()
                .filter(student -> student.mark > 15)
                .forEach(student -> {
                    System.out.println("Nom : " + student.name + ", Note : " + student.mark);
                });

    }

}
