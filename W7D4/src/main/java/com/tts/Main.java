package com.tts;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        String myString = "Hello World";
                System.out.println(myString.getClass());
    Person person = new Person("Jimmy" , 21, "USA");
    //println automatically invokes tostring
    System.out.println(person);

//    Person catDog = new Person ("cat",10,"USA",new Person("Dog"));
//    System.out.println(catDog);

//    Dog myDog = new Dog ();
//    System.out.println(myDog);

        //person.getName() is our argument it has to take shape of parameter
    person.sayHello();
    person.sayHello(person.getName());
    System.out.println(person.ageNextYear());
        System.out.println(person.getName() + " will be " +
                person.ageNextYear()
                + " years old next year.");

        Book myBook = new Book();
        Book otherBook = new Book();
        myBook.author = "RL Stine";
        System.out.println(myBook.author);
                System.out.println(otherBook.chapters);
//        int x;
//        Integer y = 4;
//        System.out.println(y,floatValue());

        Student student = new Student ("Jack",22,"USA",2022, true);
        System.out.println(student);

        List<Student> studentList = List.of(
                new Student("Bob", 22,"USA", 2022,true),
                new Student("Susie", 24,"USA", 2022,true),
                new Student("Sam", 28,"USA", 2023,true),
                new Student("test", 999,"Canada", 2080,false)
        );
//el for element here
        studentList
                .forEach(el -> el.setEnrolled(true));
        System.out.println(studentList);
        studentList.forEach(el -> System.out.println(el));

        studentList.stream().filter(el ->el.getEnrolled())
                .forEach(el -> System.out.println(el));
        //same thing without filter
        //heavily emphasis on function for implementation
    for (Student element : studentList) {
        System.out.println(element);
    }

    }

}
