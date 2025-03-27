package com.studentapp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sneha Shruti", 32, "S-01");
        s1.enrollCourse("Java");
        s1.enrollCourse("devops");
        System.out.println(s1);

        Student s2 = new Student("Priyanka Jaiswa", 30, "S-02");
        s2.enrollCourse("DSA");
        s2.enrollCourse("devops");
        System.out.println(s2);
    }
}
