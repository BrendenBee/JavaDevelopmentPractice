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
                //When first declare reference type have to be specific (Integer instead of Int, for example)
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


        //In Java, a LinkedList is a very important data structure because it serves as a template for other structures.
        //
        //
        //
        //LinkedLists consist of many objects with references to other objects. Because of this structure, LinkedLists are not indexed.
        //
        //
        //
        //The LinkedList itself functions as a container for its nodes, the objects which make up the list. This container object keeps track of the first and the last object in the list. It uses reference variables to point to these objects.


        // Linked list points to beginning and last node

        // { 5 , 4 , 3 , 6 , 7 }
        //{value: 5 next: 1} -> {value: 8 next: 2} -> {value: 4 next: 3}

        //LinkedList
        //Each object within the list has a next variable (or field) which references the proceeding object in the list.
        //
        //The object that is first, will hold a reference to the object that is second, the second to the third, etc.
        //
        //But what about the last object in the list? What can it point to in its next field? The answer is nothing, so it points to null.
        //
        //public class LinkedList {
        //    private Node first, last;
        //    //Declares private variables `first` and `last`, which are
        //    //instances of Node objects, to keep track of the first and last
        //    //nodes of the list.
        //}
        //LinkedList
        //Review: LinkedLists aren't indexed, so we don't know what position an object has in reference to the entire list, only which is first, which is last, and which comes after it.
        //
        //
        //LinkedList
        LinkedList<String> animalList = new LinkedList<String>();
        animalList.add("frog");
        animalList.add("giraffe");
        animalList.add("buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);
        // => [frog, giraffe, buffalo, mongoose]

        // Puts shark as the first element in the ArrayList
        animalList.addFirst("shark");
        System.out.println(animalList);
        // => [shark, frog, giraffe, buffalo, mongoose]

        // Puts koala as the last element in the ArrayList
        animalList.addLast("koala");
        System.out.println(animalList);
        // => [shark, frog, giraffe, buffalo, mongoose, koala]

        // This adds the value cuttlefish to the 3rd index of the LinkedList
        animalList.add(3, "cuttlefish");
        System.out.println(animalList);
        // => [shark, frog, giraffe, cuttlefish, buffalo, mongoose, koala]

        animalList.remove(3);
        // Removes the element that is at the 3rd index of the LinkedList
        animalList.remove("piranha");
        // Removes the first instance of "piranha" in the LinkedList

        animalList.removeFirst();
        // Removes the first element of the LinkedList
        animalList.removeLast();
        // Removes the last elements of the LinkedList

        animalList.contains("giraffe");
        // Returns `true` if "giraffe" is present in the LinkedList

        animalList.size();
        // Returns an integer denoting the size of the LinkedList

        animalList.get(3);
        // Returns the value located at the 3rd index of the LinkedList
        animalList.set(3, "emu");
        //Sets the value at index 4 to "emu"
        System.out.println(animalList);
        // => [frog, giraffe, buffalo, emu]

        public class LinkedList {
            private Node first, last;
            //Declares private variables `first` and `last`, which are
            //instances of Node objects, to keep track of the first and last
            //nodes of the list.
        }


        //Array lists are faster for sorting
        //Linked lists are faster at adding and removing data
        //Review: LinkedLists aren't indexed, so we don't know what position an object has in
        //reference to the entire list, only which is first, which is last, and which comes after it.
        //java.util.LinkedList; - for import


        //Queue = FIFO data structure
        //Objects are added to the back and removed from the front.
        //
        //
        //
        //When adding and removing from a queue, we call it enqueuing and dequeuing. Each data structure has a different name for adding and removing objects.​
        //
        //
        //
        //Queues have references to their first and last objects, and each object has a reference to the next one.
        //Queue acts as an interface rather than an actual object.
        //
        //We can't instantiate an interface, but we can create an instance of LinkedList and assign it to a Queue interface

        import java.util.*;

        Queue<String> q = new LinkedList<String>();

        Queue<Integer> myQueue = new LinkedList<>();

        // Adds elements {5, 6, 7, 8, 9} to queue
        for (int i=5; i<10; i++)
            myQueue.add(i);

        // Display contents of the queue.
        System.out.println("Elements of queue-"+ myQueue);

        // To remove the head of queue.
        int removedHead = myQueue.remove();
        System.out.println("removed element-" + removedHead);

        System.out.println(myQueue);

        // To view the head of queue
        int head = myQueue.peek();
        System.out.println("head of queue-" + head);

        // Rest all methods of collection interface,
        // Like size and contains can be used with this
        // implementation.
        int size = myQueue.size();
        System.out.println("Size of queue-" + size);



        //Stacks
        //Last in, first out
        //
        //The most recently added to the stack is the first to be removed.
        //This can be seen as adding to the front (or the top) and removing from the front (or the top).
        //Adding to a stack is called pushing, and removing from a stack is called popping.
        //
        //
        //Note: This can be a useful data structure to use when all of your objects are the
        //same or are used for the same thing.

        // Imports the data we need to use the Stack class

        Stack<Integer> myStack;
        // creates a reference variable for a Stack called myStack
        myStack = new Stack<Integer>();
        // creates a new Integer Stack and assigns its address to myStack

        myStack.push(1);
        // Pushes 1 to the top of our stack
        // myStack now consists of [1]
        myStack.push(2);
        // myStack now consists of [1, 2]
        myStack.push(3);
        // myStack now consists of [1, 2, 3]

        // Despite pushing to the "top" of the stack, the printed representation
        // puts our new numbers at the back. The important part is that they are
        // removed from the same place they are added.

        myStack.pop();
        //returns 3 and removes it from the stack
        //myStack now consists of [1, 2]

        //We can also look at the top of the stack without
        //removing it by using peek
        myStack.peek();
        //returns 2, but doesn't remove it
        //myStack still consists of [1, 2]

        //We may want to know if a stack is empty before we manipulate it:
        myStack.empty();
        //this will return `false` because our stack is not empty


        //Review:
        //ArrayLists = Dynamically sized lists that track items by index (good for searching/sorting)
        //HashMaps = Store data in "Maps" as Key&Value pairs (great a organizing unordered data, fast data structure)
        //Linkedists = Data is store as nodes, with each node holding a value and pointer to the next node in the list.
        // **Linked lists are fast for adding and removing data**
        // Queues = Interface (type of linked list) - FIFO functionality
        // Stacks = LIFO (Last In First Out) functionality





    }
}
