

// Class 4 : Functions or Methode

public class Class4 {
    public static void main(String[] args) {

        //alarm();

        System.out.println("Dice Roll Value: " + diceRolling());


        // Working with arrays:
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int[] numbers2 = new int[10];

        int size = numbers.length;

        for(int count = 0; count < size; count++){
            System.out.println(numbers[count] + " " + numbers2[count]);
        }

//        Output From the loops:
//        1 0
//        2 0
//        3 0
//        4 0
//        5 0
//        6 0
//        7 0
//        8 0
//        9 0
//        10 0



    }

    public static void beep() {
        System.out.println("BEEP! BEEP!");
    }

    public static void alarm() {
        boolean on = checkAlarm();
        while(on) {
            beep();
            on = checkAlarm();
        }
    }

    public static boolean checkAlarm() {
        return true;
    }


    public static int diceRolling() {
        double randomNumber = Math.random();   // This always returns [0,1) -> 0 inclusive to 1 exclusive.
        randomNumber = randomNumber * 6;
        randomNumber = randomNumber + 1;
        int dice = (int) randomNumber;

        return dice;
    }

    public void searchWifi(){

        for(int count = 0; count <= 10; count++ )
        {
            boolean wifiActivationStatus = checkWifi();
            if(wifiActivationStatus){
                System.out.println("Found Wifi!");
                break;
            }
        }
    }

    private boolean checkWifi() {
        return true;
    }

}
