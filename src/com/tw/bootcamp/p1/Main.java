package com.tw.bootcamp.p1;


import com.tw.bootcamp.p1.entities.Student;
import com.tw.bootcamp.p1.entities.Subject;

public class Main {
    static void main() {
        Subject subject = new Subject("math");
        new Student(subject);

    }
}