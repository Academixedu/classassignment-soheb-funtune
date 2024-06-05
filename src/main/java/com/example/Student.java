package com.example;

public class Student {
    private String name;
    private int age;
    static int count = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        count = count + 1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name is : " + name);
        System.out.println("and Age is : " + age);
    }

    public static int getStudentCount() {
        return count;
    }

}
