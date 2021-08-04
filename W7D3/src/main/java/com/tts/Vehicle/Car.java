package com.tts.Vehicle;

public class Car {

    //fields:
    //color
    //amount of doors

    private String color;
    private int numberOfDoors;
    private int currentRPM;
    private int speed;
    private static final int MAX_DOORS = 6;
    private static final int MIN_DOORS = 1;

    public static final String TYPE_SPORTY = "Sporty";
    public static final String TYPE_FAMILY = "Family";

    private String carType;

    //methods:
    //it can start
    //it can drive
    //it can stop

    public void start(){
        System.out.println("Car is starting...");

    }

    public void drive(){
        System.out.println("Car is driving..." );
    }

    public void stop() {
        System.out.println("Car s stopping...");

    }

        //to manipulate private values can use a setter

    public void setColor(String color){
        this.color = color;

    }
    //And we would need to use a getter

    public String getColor() {
        return color;

    }
    public void setNumberOfDoors(int numberOfDoors) {

        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getCurrentRPM() {
        return currentRPM;
    }
    private void setCurrentRPM(int rpm) {
        currentRPM = rpm;
    }
    public int setSpeed(int speed) {
        this.speed = speed;
        setCurrentRPM(calculateRPM(speed));

    }

    private int calculateRPM(int speed) {

//        int rpm = speed*getBestGear(speed) * engineFactor();
        int rpm = speed * 3;
        return rpm;

    }
    public void drive(int miles) {
        System.out.println("You have drives for: " +miles+" miles.");
    }

    public void drive(String destination) {
        System.out.println("You are heading for "+destination);
    }
//    public String getCarType(){
//
//    }

}
