public class SwitchExample {

    public static void printShirtSize(char shirt) {
        String msg = "";
        switch (Character.toLowerCase(shirt)) {
            case 's':
                msg = "The shirt is small";
                break;
            case 'm':
                msg = "The shirt is medium";
                break;
                // You can also stack switch cases
            case 'L':
            case 'l':
                msg = "The shirt is large";
                break;
            default:
                msg = "Shirt size unknown";
                break;

        }
        System.out.println(msg);
    }

//    public static void enhancedSwitch(char myCharacter) {
//
//        switch (myCharacter) {
//            case 'a' -> System.out.println("Case a was evaluated successfully");
//            case 'b' -> System.out.println("Case b was evaluated successfully");
//            default -> System.out.println("Did not understand input");
//        }
//
//    }

}
