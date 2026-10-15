package com.learning.encapsulation2;

public class StudentDriver {

    public static void main(String[] args) {

        Student s = new Student("Kamdev", 23, 41);

        // Update student details
//        s.setName("Rahul");
//        s.setAge(24);
//        s.setMarks(85);

        // Display student details
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
        System.out.println("Student Marks: " + s.getMarks());
    }
}