package com.learning.encapsulation2;

public class Student {

    private String name;
    private int age;
    private int marks;

    // Constructor
    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Setter methods
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }
}