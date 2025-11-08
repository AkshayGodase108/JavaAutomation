package exc08_While;

import java.util.Scanner;

public class Lab65_importantfactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scanner.nextInt();

        int factorial = 1;
        if (number <= 1) {
            System.out.println(factorial);
        } else {
            for (int i = 1; number >= i; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial is -> " + factorial);
        }

    }
}
