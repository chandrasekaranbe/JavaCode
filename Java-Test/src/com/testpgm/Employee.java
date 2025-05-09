package com.testpgm;

import java.util.Objects;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
/*
    @Override
    public boolean equal(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Employee))
            return false;
        Employee emp = (Employee) obj;
        return Objects.equals(this.name, emp.name);

    }*/
}
