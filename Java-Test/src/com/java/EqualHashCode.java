package com.java;


import java.util.Objects;

class Humanity{
     String name;
    Humanity(String name){
        this.name =name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o)
            return true;
        System.out.println(o instanceof Humanity);
        if (!(o instanceof Humanity))
            return false;
        Humanity h = (Humanity) o;
        return Objects.equals(this.name, h.name);
    }
    @Override
    public  int  hashCode(){
        return Objects.hash(name);
    }
}

class Dog{
     String name;
    public Dog(String name) {
        this.name = name;
    }
}

public class EqualHashCode {

    public static void main (String[] args){
        Humanity h = new Humanity("Linzhou");
        Humanity h1 = new Humanity("Linzhou");
        Dog dog = new Dog("poppy");
        System.out.println("*   "  + h.equals(dog));
        System.out.println("**" + h.equals(h1));
        System.out.println(h.hashCode());
        System.out.println(h1.hashCode());
        System.out.println(dog.hashCode());
    }




}



