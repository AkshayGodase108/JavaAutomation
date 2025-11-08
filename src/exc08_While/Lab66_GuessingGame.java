package exc08_While;

import java.util.Random;
import java.util.Scanner;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class Lab66_GuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        int numbertoguess = random.nextInt(100) + 1;
//        System.out.println(numbertoguess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number!");

        int guess;
        int attempts = 0;

        while (true) {
            guess = scanner.nextInt();
            attempts++;
            if (guess < numbertoguess) {
                System.out.println("too low try again!");
            } else if (guess > numbertoguess) {
                System.out.println("Too high try again!");
            } else {
                System.out.println("Your Guess is correct! you have guessed it in "+attempts+" Attempts");
            }

        }

    }
}