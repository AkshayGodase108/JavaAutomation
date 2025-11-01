package exc05_If_Else;

import java.util.Scanner;

public class Lab36_If_Else {
    public static void main(String[] args) {
        //To take user input we can use // scanner class also or CLI(command line interface)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = scanner.nextInt();
        if (age > 18){
            System.out.println("you are allowed to vote");
        }
        else{
            System.out.println("you are not allowed to vote");
        }

    }
}