package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();

        Student janek = new Student("Jan", "Janicki");
        Student romek = new Student("Roman", "Romowicz");
        Student alek = new Student("Aleks", "Aleksandrowicz");

        Grades janekGrades = new Grades(Arrays.asList(4.5, 2.5, 4.0));
        Grades romekGrades = new Grades(Arrays.asList(3.0, 2.5, 5.0));
        Grades alekGrades = new Grades(Arrays.asList(3.5, 4.0, 2.5));

        school.put(janek, janekGrades);
        school.put(romek, romekGrades);
        school.put(alek, alekGrades);

        for (Map.Entry<Student, Grades> studentEntry : school.entrySet()) {
            System.out.println(studentEntry.getKey().getFirstname() + " Average : " + studentEntry.getValue().getAverage());
        }

    }
}
