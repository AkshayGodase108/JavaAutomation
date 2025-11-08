package exc08_While;

import java.util.Random;
import java.util.Scanner;

public class Lab67_GuessGame {
    public static void main(String[] args) {

        Random random = new Random();
        int noofguess = random.nextInt(101);
//        System.out.println(noofguess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the guess number");


        int attempts = 0;
        while (true){
            int guess = scanner.nextInt();
            attempts++;
            if (guess<noofguess){
                System.out.println("Too Low try again!");
            }else if (guess>noofguess){
                System.out.println("Too High try again!");
            }else{
                System.out.println("your guest is correct and you have guessed it in "+ attempts +" attempts");
            }
        }
    }
}
