package com.example;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student("Alice", 20);

        Student student2 = new Student("Bob", 22);

        // Use getters
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Age: " + student1.getAge());

        // Use setters
        student1.setName("Alicia");
        student1.setAge(21);

        // Display student details
        student1.displayDetails();
        student2.displayDetails();

        // Use static function
        System.out.println("Total Students: " + Student.getStudentCount());

        System.out.println("Book Class Object is Creating ! ========================");

        Book book = new Book("Rich Dad, Poor Dad", "winchi", 4000);
        Book book2 = new Book("Life Lesson", "Soheb", 100);

        book.displayBookDetails();

        System.out.println("Total Number of Books Copies Are : " + Book.totalBooks());
    }

}
