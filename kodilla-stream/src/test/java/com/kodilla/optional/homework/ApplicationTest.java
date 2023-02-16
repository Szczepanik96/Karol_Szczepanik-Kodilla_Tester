package com.kodilla.optional.homework;

import com.kodilla.optional.OptionalExample;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
    @Test
    public void shouldReturnUndefinedIfNull() {
        List<Optional<Student>> studentList = new ArrayList<>();
        studentList.add(Optional.of(new Student("student 1", new Teacher("Teacher 1"))));
        studentList.add(Optional.of(new Student("student 2", new Teacher("Teacher 2"))));
        studentList.add(Optional.of(new Student("student 3", null)));
        studentList.add(Optional.of(new Student("student 4", null)));
        studentList.add(Optional.of(new Student("student 5", null)));
        studentList.add(Optional.of(new Student("student 6", new Teacher("Teacher 3"))));


        Application.printStudentList(studentList);

        String expectedOutput = "Name: student 1 Teacher: Teacher 1" +
                "Name: student 2 Teacher: Teacher 2" +
                "Name: student 3 Teacher: <undefined>" +
                "Name: student 4 Teacher: <undefined>" +
                "Name: student 5 Teacher: <undefined>" +
                "Name: student 6 Teacher: Teacher 3";

//        assertEquals(expectedOutput,Application.printStudentList(studentList));

    }
}