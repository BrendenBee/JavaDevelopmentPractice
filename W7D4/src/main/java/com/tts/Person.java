package com.tts;

import com.sun.jdi.IntegerType;

public class Person {

    //Think of class as template for your objects
    // Composted of following:
    // instance variables/fields(properties,nouns), constructors, methods(actions,verbs)
    //use generate right click intellij for auto getter setter


    //@Override is an annotation basically something that
    // represents metadata associated with what its annotating




    private String name;
    private Integer age;
    private String location;
    private Person person;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Person(String name, Integer age, String location) {
        //Action below can be referred to as data binding
        //we are setting up instance variables to be exactly
        //the same as values passed in as arguments into constructor
        this.name = name;
        this.age = age;
        this.location = location;
    }

    //no-arg or default constructor will be utilized heavily when working
    //with something known as java beans
    public Person () {
        this.name = name;
        this.age = age;
        this.location = location;
        this.person = person;
    }

    public void sayHello() {
        System.out.println("Hello, my name is: " + name);
    }

    //Note String name in params
    //this is parameter that dictates the shape of the arguments

    public void sayHello(String name) {
        System.out.println("Hello there, "+ name);
    }

    public Person(String name, Integer age, String location, Person person) {


    }

    public Integer ageNextYear() {
        //below is a local variable example
        //var is only legal inside of local scopes
        //var is a newer keyword in java which allows
        //to forgo mentioning a variables type
        //not always recommended but its good when one doesnt want to be
        //concerned with types being passed/defined within a local scope

        var ageNextYear = age + 1;
        return ageNextYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


@Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                "location" + location + '\'' +
                "person='" + person + '\'' +
                ", age=" + age +
                '}';
}

}
