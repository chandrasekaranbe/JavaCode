package com.java;

class Student1 {
    String name;
    Course course;

    public Student1(String name, Course course) {
        this.name = name;
        this.course = course;
    }
}

class Course {
    String name;

    public Course(String name) {
        this.name = name;
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student1 originalStudent = new Student1("Advait", course);

        Student1 shallowCopyStudent = new Student1(originalStudent.name, originalStudent.course);

        // Changes in course name affect both original and shallow copy
        shallowCopyStudent.course.name = "Mathematics";

        System.out.println(originalStudent.course.name); // Output: Mathematics
    }
}
