import java.util.*;

public class ArrayHW {

    public static void main(String[] args) {

//        Write a program to sum all the values of a given Array in Java.
//        What is the output?
        double[ ] exampleArray = {1,5,6,5,4,1};

//        double maximum = examplesArray[0];
        double arraySum = 0;
        int index = 0;

        while (index < exampleArray.length) {
            arraySum += exampleArray[index];
            index++;
//            boolean arrayComplete =
//            if(index = (exampleArray.length-1)) {
//                System.out.println(arraySum);
//            }
        }
        //For non-static methods
        //Class obj = new Class();
        //Put in main
        //Java has default constructor for non static methods
        //so you can then do obj.Method();

        System.out.println(arraySum);
        toPower(4, 2);
//        System.out.println(toPower( 4, 2));

    }
        public static int[] toPower(int size, int power) {

//            Scanner scan = new Scanner(System.in);

//              Can return anything of that type/class (like instead of integer array) in the method - OOP
//            System.out.println("Add the size of the array");
//            int arraySize = scan.nextInt();
//            System.out.println("Add the power");
//            int arrayPower = scan.nextInt();
//            ArrayList<Integer> arrayList = new ArrayList<Integer>(size);
            int array[];
            array = new int[size];
            int index = 0;
            while (index < array.length) {

                for (int i = 0; i < power;i++) {
                    int value = index * index;
                    array[index] = value;
                }

                index++;
            }
           System.out.println(Arrays.toString(array));
            return array;
        }

        //Write a public static method called "toPower" that takes in as parameters two integers called size and power.
        // The method should return an array of size "size" with each array index raised to the value of
        // "power." So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method
        // should return the following result: [0,1,4,9].







}
