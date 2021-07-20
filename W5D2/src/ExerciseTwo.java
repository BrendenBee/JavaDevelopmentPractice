import java.util.*;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> vehicles = new HashMap<>();

        vehicles.put("Honda" , "Accord");
        vehicles.put("Ford" , "Fusion");
        vehicles.put("Chevrolet" , "Corvette");


        System.out.println("What kind of vehicle are you looking for today?");

        String make = scan.nextLine();

//        if (vehicles.containsKey(make)) {
//            System.out.println("We have that vehicle in stock! What model are you looking for?");
//        } else {
//            System.out.println("We don't have that in stock, sorry!");
//            System.exit(0);
//        }
        if (vehicles.containsKey(make)) {
            System.out.println("We have that vehicle in stock! What model of " + make + " are you looking for?");
        }
        while (!vehicles.containsKey(make)) {

            System.out.println("We don't have that in stock, sorry!");
            make = scan.nextLine();

            if (vehicles.containsKey(make)) {
                System.out.println("We have that vehicle in stock! What model of " + make + " are you looking for?");
            }
        }

        String model = scan.nextLine();

        if (vehicles.containsValue(model)) {
            System.out.println("We have that model in stock! Now let's get the paperwork signed for your " + make + " " + model + ".");
        }
        while (!vehicles.containsValue(model)) {

            System.out.println("We don't have that in stock, sorry!");
            model = scan.nextLine();

            if (vehicles.containsValue(model)) {
                System.out.println("We have that model in stock! Now let's get the paperwork signed for your " + make + " " + model + ".");
            }
        }










    }
}
