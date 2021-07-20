import java.util.*;
public class ExerciseOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numArray;
        numArray = new int[5];

        //I should redo this with an array list and create a for/while big loop for the calculations
        System.out.println("Add a number");
        int num1 = scan.nextInt();
        numArray[0] = num1;
        System.out.println("Add a number");
        int num2 = scan.nextInt();
        numArray[1] = num2;
        System.out.println("Add a number");
        int num3 = scan.nextInt();
        numArray[2] = num3;
        System.out.println("Add a number");
        int num4 = scan.nextInt();
        numArray[3] = num4;
        System.out.println("Add a number");
        int num5 = scan.nextInt();
        numArray[4] = num5;

        int sum = num1 + num2 + num3 + num4 + num5;
        int product = num1 * num2 * num3 * num4 * num5;
        int largestNum = Integer.MIN_VALUE;
        int index = 0;
        while( index < numArray.length ) {
            //check if largest num is smaller than the element
            if( largestNum < numArray[index] ) {
                //update largestNum
                largestNum = numArray[index];
            }
            index++;
        }
        int smallestNum = Integer.MAX_VALUE;
        int reverseIndex = 0;
        while( reverseIndex < numArray.length ) {
            //check if smallest num is greater than the element
            if( smallestNum > numArray[reverseIndex] ) {
                //update smallestNum
                smallestNum = numArray[reverseIndex];
            }
            reverseIndex++;
        }


        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The product of the number is: " + product);
        System.out.println("The largest number is: " + largestNum);
        System.out.println("The smallest number is: " + smallestNum);



    }
}