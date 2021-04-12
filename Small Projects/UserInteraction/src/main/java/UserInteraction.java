import java.util.Random;
import java.util.Scanner;

public class UserInteraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name);

        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess = 0;
        for(int count = 0; count < 7; count++) {
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();

            if(guess == randomNumber) {
                break;
            }
            else if(guess > randomNumber) {
                System.out.println("Your guess is more than the random.");
            }
            else {
                System.out.println("Your guess is less than the random.");
            }
            System.out.println("You have " + (7 - count - 1) + " chance left.");
        }
        if(guess == randomNumber)
            System.out.println("Yahoo! You have won the  game.");
        else
            System.out.println("Alas! You have lost.");
    }
}
