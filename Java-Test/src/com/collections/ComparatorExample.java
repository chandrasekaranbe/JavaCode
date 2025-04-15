package com.collections;

import java.util.*;

public class ComparatorExample {
    public static void main (String[] args){
        Car[] car = new Car[3];
        car[0] = new Car("Tata","Tiago");
        car[1] = new Car("Benz","x300");
        car[2] = new Car("Maruthi","Ertiga");
        //decnding order
        System.out.println("******Decending Order *********");
        Arrays.sort(car,(Car obj1,Car obj2) -> obj2.getName().compareTo(obj1.getName()));
        for (Car cararray :car){
            System.out.println(cararray.getName() +" ::::: "+ cararray.getType());
        }

        //asending order

        System.out.println("******Acending Order *********");
        Arrays.sort(car,(Car obj1,Car obj2) -> obj1.getName().compareTo(obj2.getName()));
        for (Car cararray1 :car){
            System.out.println(cararray1.getName() +" ******** "+ cararray1.getType());
        }


        //List
        System.out.println("******Comparator Order *********");
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Tata","Tiago"));
        carList.add(new Car("Benz","x300"));
        carList.add(new Car("Maruthi","Erthiga"));

        Collections.sort(carList ,new Car());

        for (Car cararray2 :carList){
            System.out.println(cararray2.getName() +" :: "+ cararray2.getType());
        }


        //List
        System.out.println("******Comparable Order *********");
        List<Car1> carList1 = new ArrayList<>();
        carList1.add(new Car1("Tata","Tiago"));
        carList1.add(new Car1("Benz","x300"));
        carList1.add(new Car1("Maruthi","Erthiga"));

        Collections.sort(carList1);

        for (Car1 cararray3 :carList1){
            System.out.println(cararray3.getName() +" **::** "+ cararray3.getType());
        }


    }
}
