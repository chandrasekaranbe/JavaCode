package com.java;


import java.lang.reflect.Field;

class  Student{
    private String name;
    private int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.println("Name: " + name + ", Age: " + age);
        //return null;
    }
}
public class ReflectionExample {
    public static void main(String[] args) {
        Student student = new Student("Chandra", 39);

        Class<?> studentClass = student.getClass();
        try {
            Field nameField = studentClass.getDeclaredField("name");
            nameField.setAccessible(true);
            String name = (String) nameField.get(student);
            System.out.println(name);


            // Access the 'age' field
            Field ageField = studentClass.getDeclaredField("age");
            ageField.setAccessible(true);
            int ageValue = (int) ageField.get(student);
            System.out.println("Age Field: " + ageValue);

            // Modify the 'name' field
            nameField.set(student, "Shanav");
            student.display();
            //System.out.println("Updated Name Field: " + student.display());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
