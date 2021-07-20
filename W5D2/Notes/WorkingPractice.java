import java.util.*;
public class WorkingPractice {
    public static void main(String[] args) {


    String[] arr = {"John", "Michelle", "Tommy"};
    String[] arr2 = new String [5];

    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(0,9);
    arrayList.add(5);
    arrayList.add(7);
    arrayList.add(9);
    System.out.println(arrayList.get(0));
    System.out.println(arrayList.size());

    String myString = "I really like ice cream";
    String[] str = myString.split(" ");
    System.out.println(Arrays.toString(str));
    List<String> arrayString = new ArrayList<>();
    arrayString = arrayString.asList(str);
    System.out.println(arrayString.toString());

        HashMap<String, Integer> takeoutFood = new HashMap<>();
        takeoutFood.put(1, "Pizza");
        takeoutFood.put(2, "Fries");
        takeoutFood.put(2, "Burger");
        System.out.println(takeoutFood.get(1));
        takeoutFood.remove(3);
        takeoutFood.put(1, "Chicken");
        System.out.println(takeoutFood.get(1));
        System.out.println(takeoutFood.containsKey(1));
        System.out.println(takeoutFood.containsValue("Pizza"));


    ArrayList<String> carArray = new ArrayList<>();
        arrayList.add("Honda");
        array.add("Toyota");
        array.add("Ford");
        for(String car: array){
            System.out.println(car);
        }

        for(Map.Entry<Integer, String> entry :takeoutFood.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);

        }



    }
}
