package com.tts;
//import java.io.File;
import java.util.ArrayList;

import com.tts.Vehicle.Car;
import com.tts.Example.Example;
public class Main {

    public static void main(String[] args) {

    System.out.println(Example.x);
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Hello");
    arrayList.add("World");
    System.out.println(arrayList.size());
    System.out.println(arrayList);

    //invoking its constructor
        //obj has auto constructors

        Car car = new Car("blue",4);
//        car.color = "blue";
//        car.numberOfDoors = 4;

//        car.setNumberOfDoors(4);
        System.out.println(car.getNumberOfDoors());

//        car.setColor("Blue");
        System.out.println(car.getColor());

        car.start();
        car.drive();

        ArrayList<Integer> integers = null;
        System.out.println(integers);
        //overloading method example
        car.drive();
        car.drive("Boston");




    }



}
