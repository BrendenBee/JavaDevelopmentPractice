import java.util.Random;

public class BranchingExample
{
    public static void breakFor() {
        Random random = new Random();
        int breakAt = random.nextInt(100);
        outer:
        for (int x = 1; x <= 5; x++){
            System.out.println("Starting point for x: " + x);

            inner:
            for (int i = 0; i < 100; i++) {
                if (i == breakAt) {
                    System.out.println("Random number was: " + breakAt);
                    //break stops loop from going to 100
                    //can break specific loops and nested loops
                    break;
                }
            }
        }
    }
    public static void continueFor() {

        for(int i = 0; i <10; i++) {
            if(i % 2 == 0){
                continue;
            }
            //System will only print odd numbers due to continue in if statement
            System.out.println(i);
        }
    }
    public static Integer returnXOrNothing(int x){
        if(x>3){
            System.out.println("X is greater than 3, exiting method with value...");
            //return voids not necessary
            return x;
        }


        return 0;
    }
//    public static String returnString(int x){
//
//
//    }


}
