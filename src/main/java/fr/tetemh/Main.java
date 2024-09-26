package fr.tetemh;

import com.github.javafaker.Faker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            students.add(new Student(faker.name().firstName()));
        }
        System.out.println(students);
        System.out.println(students.reversed());
    }
}