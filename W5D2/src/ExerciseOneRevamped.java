import java.util.*;
public class ExerciseOneRevamped {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        ArrayList<Integer> arrayList = new ArrayList<Integer>(5);

            for (int i = 0; i < 5; i++) {
                System.out.println("Add a number");
                arrayList.add(i, scan.nextInt());
            }


            int sum = 0;
            int product = 1;
            int largestValue = Integer.MAX_VALUE;
            int smallestValue = Integer.MIN_VALUE;



                for(int i = 0; i < arrayList.size(); i++) {

                    sum += arrayList.get(i);

                    product *= arrayList.get(i);

                    if( smallestValue < arrayList.get(i) ) {

                        smallestValue = arrayList.get(i);
                    }

                    if( largestValue > arrayList.get(i) ) {

                        largestValue = arrayList.get(i);
                    }
                }

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The product of the number is: " + product);
        System.out.println("The largest number is: " + largestValue);
        System.out.println("The smallest number is: " + smallestValue);







//        System.out.println("Add a number");
//        int num1 = scan.nextInt();
//        numArray[0] = num1;
//        System.out.println("Add a number");
//        int num2 = scan.nextInt();
//        numArray[1] = num2;
//        System.out.println("Add a number");
//        int num3 = scan.nextInt();
//        numArray[2] = num3;
//        System.out.println("Add a number");
//        int num4 = scan.nextInt();
//        numArray[3] = num4;
//        System.out.println("Add a number");
//        int num5 = scan.nextInt();
//        numArray[4] = num5;

//        int sum = num1 + num2 + num3 + num4 + num5;
//        int product = num1 * num2 * num3 * num4 * num5;
//        int largestNum = Integer.MIN_VALUE;
//        int index = 0;
//        while( index < numArray.length ) {
//            //check if largest num is smaller than the element
//            if( largestNum < numArray[index] ) {
//                //update largestNum
//                largestNum = numArray[index];
//            }
//            index++;
//        }
//        int smallestNum = Integer.MAX_VALUE;
//        int reverseIndex = 0;
//        while( reverseIndex < numArray.length ) {
//            //check if smallest num is greater than the element
//            if( smallestNum > numArray[reverseIndex] ) {
//                //update smallestNum
//                smallestNum = numArray[reverseIndex];
//            }
//            reverseIndex++;
//        }
//
//
//        System.out.println("The sum of the numbers is: " + sum);
//        System.out.println("The product of the number is: " + product);
//        System.out.println("The largest number is: " + largestNum);
//        System.out.println("The smallest number is: " + smallestNum);



    }
}