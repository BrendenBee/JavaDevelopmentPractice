import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("This is a madlib exercise!");
        System.out.println("What is your name?");
        String name = userInput.nextLine();
        System.out.println("Give me an adverb.");
        String adverb = userInput.nextLine();
        System.out.println("Give me an adjective.");
        String adjective = userInput.nextLine();
        System.out.println("Give me a noun.");
        String noun = userInput.nextLine();
        System.out.println("Give me another noun. ");
        String nounTwo = userInput.nextLine();
        System.out.println("Give me a number in string form.");
        String number = userInput.nextLine();
        System.out.printf("Dear %s,\n", name);
        System.out.printf("\nYou are %s %s and I want to be your %s!\n", adverb, adjective, noun);
        System.out.printf("\nI want to go to the %s with you in %s days!\n", nounTwo, number);
        System.out.printf("\nSincerely, Brenden\n");


    }
}

