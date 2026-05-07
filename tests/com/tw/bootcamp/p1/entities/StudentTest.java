package com.tw.bootcamp.p1.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student(1, Subject.MATH);
    }

    @Test
    void shouldBeEqualIfTwoInstancesAreSame() {
        Student anotherStudent = new Student(1, Subject.MATH);

        assertEquals(student, anotherStudent);
    }
}