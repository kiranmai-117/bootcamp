package com.tw.bootcamp.p1.entities;

import java.util.Objects;

public class Student {

    private final int id;
    private final Subject subject;

    public Student(int id, Subject subject) {
        this.id = id;
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && subject == student.subject;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subject);
    }
}
