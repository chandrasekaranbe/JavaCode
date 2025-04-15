package com.stream;

public class Employee {

    private String name;
    private String country;
    private String department;

    private int age;

    private double salary;

    public Employee(String name, String country, String department) {
        this.name = name;
        this.country = country;
        this.department = department;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + department + ")";
    }

}
