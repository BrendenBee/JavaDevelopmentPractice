import java.util.*;
public class Main {



        public static void main(String[] args) {




           checkId(true, 21, true);
           elseIf("BrendenBee");
           SwitchExample.printShirtSize('M');
           LoopExample.forLoop();
           WhileExample.whileLoop();
           WhileExample.doWhiteLoop();
           BranchingExample.breakFor();
        BranchingExample.continueFor();
        BranchingExample.returnXOrNothing(4);

        }

        public static void checkId(boolean validId, int age, boolean buyingAlcohol) {

                if (validId) {
                        System.out.println("Valid ID presented");
                        if (age < 21) {
                                System.out.println("Customer cannot purchase alcohol");
                        }
                        if ((age >=21) && buyingAlcohol) {
                                System.out.println("Customer legal to purchase alcohol");
                        }
                } else {
                        System.out.println("Error: Invalid ID");
                }

        }

        public static void elseIf(String name) {

                if (name.length() > 8) {
                        System.out.println("Your name is extremely long!");

                } else if (name.length() > 5) {
                        System.out.println("Your name is really long");
                } else if (name.length() > 3) {
                        System.out.println("Your name is long");
                }
        }
}
