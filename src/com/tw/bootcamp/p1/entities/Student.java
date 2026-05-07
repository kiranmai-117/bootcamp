package com.tw.bootcamp.p1.entities;

import java.util.Objects;

public class Student {

    private final Subject subject;

    public Student(Subject subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(subject, student.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(subject);
    }
}
