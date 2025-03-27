package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    static List<Student> studentList;
    public static void main(String[] args) {

        studentList = new ArrayList<>();
        Student s1 = new Student("Sneha Shruti", 32, "S-01");
        s1.enrollCourse("Java");
        s1.enrollCourse("devops");
        System.out.println(s1);

        Student s2 = new Student("Priyanka Jaiswa", 30, "S-02");
        s2.enrollCourse("DSA");
        s2.enrollCourse("devops");
        System.out.println(s2);

        Student s3 = new Student("Sam Jaiswa", 35, "S-03");
        s3.enrollCourse("devops");
        System.out.println(s3);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        System.out.println("Result :"+findStudentById("S-05"));
        sortByName();
    }
    public static Student findStudentById(String studentId){
        Student result = null;
        try {
            result = studentList.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("No Data Found!!!"));
        }catch(RuntimeException e){
            System.err.println("Student "+studentId+" is not found!!!");
        }
        return result;
    }
    private static void sortByName(){
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        Collections.sort(studentList, (o1,o2)-> o1.getName().compareTo(o2.getName()));
        System.out.println("Student sorted by Name are: \n"+studentList);
    }
}
