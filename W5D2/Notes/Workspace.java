package Notes;

import java.util.Scanner;
public class Workspace {
    public static void main(String[] args) {

        //Asks for input then outputs the integer
        Scanner scan = new Scanner(System.in);
        System.out.println("Add a num");
        int num = scan.nextInt();
        System.out.println(num);


        //Arrays are a collection of data.
        //
        //The data stored in an array is collectively known as elements.

        //An array can hold any sort of data type.
        //
        //In Java, all elements in an array must be of the same data type.

        //creates an array of strings
        String[] fruit;

        //creates an array of integers
        int[] classSize;

        //creates an array of boolean
        boolean[] brokenLights;

        //creates an array of names
        String[] names = {"John", "Daryl", "Mike", "Sarah", "Michelle"};

        String[] my_array = {"mary","sybil","edith"};

        console.printf(my_array[1]);
        // returns "sybil" since indeces start at [0]


        //Using Array methods in Java is done using the Array class in our program.  This class is part of
        //the java.util package and can bring in the inheritance of the Array class that
        //let us create and inspect our array.

        import java.io.Console;
        import java.util.*;

        public class ArrayPractice {
            public static void main(String[] args){
        ...

            }
        }



        //Example two:

        import java.io.Console;
import java.util.*;

        public class ArrayPractice {
            public static void main(String[] args){
                String[] my_array = {"Aaron","Joan","Layla"};
                Console console = System.console();

                console.printf(my_array[1]);
                // returns "Joan"
                int size = my_array.length;
                System.out.println(size);
                // returns the length or size of the array (3)
            }

        }

        //collection (size, toString) -> list(size, toString, add, remove)
        //Can add to child but must contain original parts at least
        List <data-type> list1= new ArrayList();
        List <data-type> list2 = new LinkedList();
        List <data-type> list3 = new Vector();
        List <data-type> list4 = new Stack();


        //The Array class will not allow you to change the size of the array.
        //
        //To do that, you must use an ArrayList.
        //
        //ArrayList is also available by using the java.util.* import. While Arrays are fixed sized,
        //ArrayLists are dynamic sized arrays in Java that allow us to add and remove elements.


        import java.io.Console;
import java.util.*;

        public class ArrayPractice {
            public static void main(String[] args){
                //our array code from before
                //This creates an array list of Integers call otherArray.
                //When first declare reference type have tobe specific (Integer instead of Int, for example)
                ArrayList<Integer> otherArray = new ArrayList<Integer>(2);

            }
        }

        // Choose which index to grab example
        //arrayList.get(1);
        //get length
        //arrayList.size();

        //To modify our ArrayList, we call on the methods associated with
        //the ArrayList object - .add(), .get(), .remove()
        ArrayList<String> names = ArrayList<String>();
        //Creates an array of string called "names"

        ArrayList<String> names = new ArrayList<String>(5);
        //Creates an array of string called "names" that has 5 indexes
        //The size is not permanent and can grow or shrink.


        //adds elements to the end of the array
        names.add("John");
        names.add("Heather");
        names.add("Joe");
        //adds an element to a specifc index
        names.add(2, "Finn"); //adds "Finn" to index 2, moves "Joe" to index 3

        //retrieves element values based on index number
        names.get(1);  //returns "Heather"

        //removes an element from an ArrayList
        names.remove("Finn"); //takes "Finn" out of the list, moves "Joe" back to index 2
        // index 3 no longer exists


        //https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
        //For more methods

        names = {John, Heather, Joe, Finn} //original ArrayList

        //reverse the contents by calling Collections.reverse(ArrayListName)
        Collections.reverse(names);
        =>[Finn, Joe, Heather, John] //after reversing the elements


        //Get the size of the ArrayList
        System.out.println(names.size());
        => 4

        //Checks the array list for a specific element
        names.contains("Heather")
                => true

        //remove all elements from list
        names.clear();
        => names ={}

        //Create a new string
        String myString = "I really love icecream!";

        //Create another string that holds the split version of the first
        String str[] = myString.split(" ");

        //Use the List class to create a new ArrayList
        List<String> arrayString = new ArrayList<String>();

        //Store the contents of our split string as elements in
        //arrayString using the Array.asList to convert the string into an array
        arrayString = Arrays.asList(str);
        =>[I, really, love, icecream!] //Turns the string myString into an array


        //For conversion from an Array to a String, we use the String class method .toString()

        //ArrayList of strings
        fruitList = {"Apple", "Banana", "Grape"}

        //Convert the list to an Array using .toArray method
        Object[] fruitArray =  fruitList.toArray();

        //create a new string to hold the converted array in string form.
        String fruitString = Arrays.toString(fruitArray);
        =>[Apple, Banana, Grape] //output of fruitString


        //to remove brackets and commas, use the String method .replace
        System.out.println(Arrays.toString(fruitArray)
                .replace("[","").replace("]","").replace(",", " "));
        => Apple Banana Grape


        //HashMaps are similar to Arrays and ArrayLists, in that they're a collection of data.
        //
        //While Arrays are stored by index,
        //
        //HashMaps store data as "key"/"value" pairs.

        //Creates a HashMap with a String as key and Integer as the value it points to
        //Not traditional array, more like pool you throw into and get later on


        //Each "key" & "value" are separated by an equal (=) sign

        HashMap<String, Integer> person = new HashMap<>();

        //.put adds items to the hash map
        person.put("Joan", 21);
        person.put("Anna", 34);
        person.put("Mike", 55);
        person.put("Daniel", 42);

        //creates the following HashMap
        => {Joan=21, Mike=55, Daniel=42, Anna=34}


        //.get retrieves data from the hash map
        person.get("Joan");
        => 21 //returns the value associated with the key

        //.remove takes the specified key and it's value out of the hash map
        person.remove("Mike");
        =>{Joan=21, Daniel=42, Anna=34}

        //replace the value of a given key
        person.put("Joan", 42);
        =>{Joan=42, Daniel=42, Anna=34} //changes the associated value from 21 to 42

        //checks for a key within a HashMap.  Returns a boolean value
        person.containsKey("Daniel");
        =>true


        //checks for a key within a HashMap.  Returns a boolean value
        person.containsValue(34);
        =>true

        //Returns true if this map contains no key-value mappings.
        person.isEmpty();
        => false


        //Loops
        //As a review, code blocks are chunks of code that come between braces {}.
        //
        //Some blocks come pre-defined with particular rules.
        //
        //These blocks are loops.
        //
        //They check if a condition is true, then perform a block of code
        //
        //until the condition becomes false
        //
        //(through some manipulation in the code block)
        //
        //
        //
        //An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an iterator because iterating is the technical term for looping.
        //
        //To use an Iterator, you must import it from the java.util package


        //Looping Through Collections
        //
        //To loop through collections, we use the for loop. The for loop iterates through the collection to access each item individually.
        //
        //The for loop works on both ArrayLists & HashMaps,
        //
        //though in slightly different ways.


        //ArrayLists forEach
        fruitList = ["Apple", "Banana", "Grapes"]


        for (String fruit : fruitList){
            System.out.println(fruit);
        }
        //$ java ArrayPractice
        //Apple
        //Banana
        //Grapes
        //Fruit represents each element in the fruitList array list.
        //
        //Each array element is print with each loop through the array list.

        //Map.Entry interface allows us to work with a hash map entry.
        //
        //The entrySet( ) method returns a Set containing the map entries. Each of these set elements is a Map.Entry object.

        person = {Joan=22, Daniel=42, Anna=34}

        //loop through the hash map and return each key/value pair
        for (Map.Entry<String, Integer> entry : person.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }

        $ java HashPractice
        Joan:22
        Daniel:42
        Anna:34




















    }
}
