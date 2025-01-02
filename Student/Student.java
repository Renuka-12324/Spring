package com.example.Student;

public class Student {

    int rollNo;
    String name;
    int age;


    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name=" + name +
                ", age=" + age +
                '}';
    }


}
