package com.collections;

public class Car1 implements Comparable<Car1> {

    private String name;
    private String type;

    Car1(){}
    public Car1(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public int compareTo(Car1 o) {
        return (this.getName().compareTo(o.getName()));
    }
}
