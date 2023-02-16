package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Optional<Student>> students = new ArrayList<>();

        students.add(Optional.of(new Student("Jonasz", new Teacher("Dumbledor"))));
        students.add(Optional.of(new Student("Kwazimodo", new Teacher("Snape"))));
        students.add(Optional.of(new Student("Hermiona", null)));
        students.add(Optional.of(new Student("Malfoj", new Teacher("Barabasz"))));
        students.add(Optional.of(new Student("Gini", null)));
        students.add(Optional.of(new Student("Frodo", new Teacher("Baggins"))));

        printStudentList(students);
    }

    public static void printStudentList(List<Optional<Student>> students) {
        for (Optional<Student> studentList : students) {
            studentList.ifPresent(student -> {
                String teacherName = student.getTeacher() != null ? student.getTeacher().getName() : "<undefined>";
                System.out.println("Name: " + student.getName() + " Teacher: " + teacherName);
            });
        }
    }
}
