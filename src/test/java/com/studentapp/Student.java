package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<String> getCourses() {
        return courses;
    }

    private String name;
    private int age;
    private String studentId;
    private List<String> courses;

    public Student(String name, int age, String studentId){
        super();
        if(validateAge(age) && validateName(name) && validateStudentId(studentId)) {
            this.name = name;
            this.age = age;
            this.studentId = studentId;
            courses = new ArrayList<>();
        }
    }

    public void enrollCourse(String course){
        if( validateCourseName(course)) {
            if (!courses.contains(course)) {
                courses.add(course);
                System.out.println("Student is enrolled to " + course + " successfully!!!");
            } else {
                System.err.println("Student is already enrolled to this course!!!");
            }
        }
    }

    public boolean validateCourseName(String course){
        if(course.equalsIgnoreCase("Java") || course.equalsIgnoreCase("DSA") || course.equalsIgnoreCase("DevOps"))
            return true;
        else{
            System.err.println("Invalid Course Name!!! Please enter courses as DevOps/DSA/Java");
            return false;
        }
    }

    public void printStudentInfo(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
        System.out.println("Student Id: "+studentId);
        System.out.println("Enrolled for: "+courses);
    }

    public boolean validateAge(int age){
        if(age>=19 && age<=35)
            return true;
        else{
            System.err.println("Invalid age!!! Student age should be between 19 to 35");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", courses=" + courses +
                '}';
    }

    public boolean validateName(String name){
        String nameRegex = "^[a-zA-Z\\s]+$";
        Pattern namePattern = Pattern.compile(nameRegex);
        Matcher nameMatcher = namePattern.matcher(name);

        if(nameMatcher.matches()){
            return true;
        }else{
            System.err.println("Invalid Name!!! Please enter alphabets only.");
            return false;
        }
    }
    public boolean validateStudentId(String studentId){
        String studentIdRegex = "S-[0-9]+$"; // "S-\\d+$"
        Pattern studentIdPattern = Pattern.compile(studentIdRegex);
        Matcher studentIdMatcher = studentIdPattern.matcher(studentId);
        if(studentIdMatcher.matches()){
            return true;
        }
        else{
            System.err.println("Invalid studentId!!! StudentId should be as S-123");
            return false;
        }
    }
}
