public class Examples {
    public static void main(String[] args) {


        char answer = 'Y';             // 'Y' as the explicit character value
        char middleInitialC = 0x0043;  // 'C'as a hexidecimal
        char lowerCaseA = \u0061;      // 'a' as a unicode
        char capitalK = 75;            // 'K' as an integer value

        long BigLong = 230L;          // long (l, L)
        float SomeFloat = 927.42f;    // float (f, F)
        double someDbl = 392.2d;      // double (d, D)
        double wishfulSalary = 123_000_100_325.0d; // stored/printed as 123000100325.0

//        Casting is a way to force the compiler to bend to your wishes as a programmer by putting the desired type in parentheses in front of the variable.
//
        byte b = (byte) 2321;
//        However,  this may not keep you from getting unexpected results. Casting should be kept to a minimum.

        int smallInt = 120;   //int is 4 bytes
        int biggerInt = 550;  //int is 4 bytes

//downcasting 4 bytes into 1 byte
        byte b1= (byte)smallInt;  //value in both will be 120
        byte b2= (byte)biggerInt; //value out of range, will be truncated

//downcasting 4 bytes into 2 bytes
        short s1= (short)biggerInt;   //value in range, no truncation

        We can increment or decrement an integer by using ++ and --.

>int num1 = 2;
=> 2
                > num1 ++;
//increments num1 by 1
=> 3

                > int num1 = 4;
=> 4
                > num1 --;
//decrements num1 by 1
=> 3
//        For the pre- and post-increment/decrement operators, the location of the operand determines when the change of value takes place. This can be important in certain looping and evaluation constructs.

        System.out.println(x++);  // prints 5
        System.out.println(x);    // prints 6
        System.out.println(++x);  // prints 7

        int num1 = 2; //=> 2
        int num2 = 4; //=> 4
        num1 += num2; //value of num1 = 6: same as num1 = num1 + num2

        num2 -= num1; //value of num2 = 2

        num1 *= num2; //value of num1 = 8

        num2 /= num1; //value of num2 = 2

        if (sum > 13 && sum < 26) {
            System.out.println("Right in the sweet spot.");
        } else {
            System.out.println("Too little, too much.");
        }


// when comparing strings remember to use equals() method
        if (choice.equals("cash") || choice.equals("credit")) {
            System.out.println("Thanks for shopping at our store.");
        } else {
            System.out.println("Sorry, we don't accept checks.");
        }

        if (condition){
            //task to perform if condition is TRUE
        } else {

            //task to perform if condition is FALSE
        }

        int ageLimit = 18;

        System.out.println("How old are you?");

        int age;

        int ageLimit = 18;

        System.out.println("How old are you?");

//        When getting input using userInput.nextLine(), the data is captured as a String type. Since we are looking for an integer value, we need to convert the input to an integer.  We do this by using:
//
//        Integer.parseInt()
//
//        which converts the input to an integer, and allows it to be stored in the age variable.

        int age = Integer.parseInt(userInput.nextLine());

        int ageLimit = 18;

        System.out.println("How old are you?");

        int age = Integer.parseInt(userInput.nextLine());

        if (age < ageLimit){
            System.out.println("You are too young! Sorry!");
            System.exit(0);
        } else {
            //Program continues as normal because they past the age test!
        }

//Madlib Complete code

        import java.util.Scanner;

        public class MadLib {
            public static void main(String[] args){

                Scanner userInput = new Scanner(System.in);
                int ageLimit = 18;

                System.out.println("How old are you?");

                int age = Integer.parseInt(userInput.nextLine());


                if (age < ageLimit){
                    System.out.printf("You are too young! Sorry!\n");
                    System.exit(0);
                } else {

                    Scanner userInput = new Scanner(System.in);
                    System.out.println("Enter a name: ");
                    String name = userInput.nextLine();
                    System.out.println("Give me an adjective: ");
                    String adjective = userInput.nextLine();
                    System.out.println("Give me a verb: ");
                    String verbOne = userInput.nextLine();
                    System.out.println("Give me another verb: ");
                    String verbTwo = userInput.nextLine();
                    System.out.println("Give me a number: ");
                    String number = userInput.nextLine();
                    System.out.println("Give me your name: ");
                    String yourName = userInput.nextLine();

                    System.out.printf("Here is your story: \n");
                    System.out.printf("\n Dear %s,", name);
                    System.out.printf("\n You are extremely %s and I want to %s you!", adjective, verbOne);
                    System.out.printf("\n I want to %s you %s times.", verbTwo, number);
                    System.out.printf("\n Sincerely, %s \n", yourName);

                }
            }

        }

// known as camel case, first word lower case and subsequent words capitalized
        int currentScoreOfGame;

// known as snake case, all lower case with an underscore between each word
//this is not really a convention often used in java, but might appear in other languages
        int current_score_of_game;

// known as Pascal case, first letter of each word capitalized
        int FinalScoreOfGame;

// leading underscore sometimes used for short-lived or special purpose names
        int _membersOutOfTown;

// Not used often in Java, more often in JavaScript to denote a variable tied to an event
        int $amountOfBill;

// All Caps with an underscore between words is a common convention for constant values
        double TAX_RATE = 7.0;

//        The easiest way to create an instance of a wrapper class is to use the object creation keyword new.
//
//                Integer nt = new Integer(55);
//        One very handy method on all the wrapper classes the the parseXxx() method, which is a method that takes a String and tries to make a numeric value out of it.

                Double number = Double.parseDouble("1203.44");

        Long aLong = Long.parseLong("349392");

        //These are some of the other common methods that are typically very useful.
        //
        //Method	Description
        //compare(Type t1, Type t2)	method that compares two values. returns 0 if equal, a negative value if argument 1 is less than argument 2, and a positive value if 2 greater than 1
        //compareTo(Type t1)	method that compares the instance value to the argument value and returns the same information as above
//min(Type t1, Type t2)  	method that returns the lower of the two arguments
//max(Type t1, Type t2)	method that returns the greater of the two arguments
//sum(Type t1, Type t2)	method that returns the sum of the two arguments

        //The Java type String is a class type provided by the Java language. It is not a native type but is often thought of as fundamental since it is not user-defined and is provided by the framework itself.
        String s1 = "Hello";
        String s2 = new String("World");
        //Strings are created through either literal assignment or by using the String constructor.

//        At its core, the String type is a list (collection) of primitive characters. The String class gives us a convenient way of handling and working with what is, essentially, an array of chars.
//
//        One of the fundamental things to do with a collection is to measure how many items are in it.

        int len = s1.length();  // equals 5
        bool sameLen = (s1.length() == s2.length()); // equals true
//        Strings can also be combined to build bigger Strings.

                String greeting = s1.concat(s2);  // greeting will now hold "HelloWorld" with no space.
        String longGreeting = s1.concat(" ").concat(s2).concat(" from Java!");
// longGreeting will now be "Hello World from Java!"

        String longGreeting = s1 + " " + s2 + " from Java!";
// longGreeting will now be "Hello World from Java!"

        int ndex = longGreeting.indexOf('W');             // ndex equal to 6
        int last = longGreeting.lastIndexOf('o');         // last equal to 14
        boolean contains = longGreeting.contains("fro");  // true
        boolean starts = longGreeting.startsWith("h");    // false
        char charVal = longGreeting.charAt(10);           // 'd'
        String lan = longGreeting.substring(17);          // lan = Java!
        String planet = longGreeting.substring(6, 11);    // planet = World
        boolean noNums = longGreeting.matches("d+");      // false - regular expression search for any number




        String str = String.format("%s was found at position %d.", planet, ndex);

        //The placeholders always begin with a percent (%) symbol and the information after specifies how the corresponding output variable should be converted and formatted.
        //
        //Note that for some of the format specifiers there could be additional specifiers.  For example the float placeholder may be seen as %.2f which means that the number should be displayed with two digits after the decimal place.

        //Format	Description
        //f	numeric floating point
        //d	numeric integer
        //c 	Unicode character
        //s	String
        //x	Hexadecimal
        //e	scientific notation
        //t	Date/Time

        //When checking to see if two string are equal, we use Object.equals() method.
        //Using Object.equals() checks value equality and is best for string comparisons

        String word1 = "Hello";
        String word2 = "Hello";
        String word3 = "Goodbye";

        word1.equals(word2); //true
        word1.equals(word3); //false

// These two have the same value
        new String("Hello World").equals("Hello World") // --> true

// "==" checks if they are the same object, and they are not the same object
//One is a string object the other is a literal
        new String("Hello World") == "Hello World" // --> false

// These are both String objects, but not the same
        new String("Hello World") == new String("Hello World") // --> false

// Literals are interned strings and seen as the same object by the compiler
        "test" == "test" // --> true

// String literals are concatenated by the compiler yet the results are not seen as the same object.
        "Hello World" == "Hello " + "World" // --> false



    }
}
