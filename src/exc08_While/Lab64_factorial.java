package exc08_While;

import java.util.Scanner;

public class Lab64_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number!");
        int number = scanner.nextInt();

        int factorial = 1;
        if (number<=1){
            System.out.println("Factorial of the "+number+" is "+factorial);
        }else {
            for(int i=1; i<=number; i++){
                factorial = factorial*i;

            }
            System.out.println("Factorial of the "+number+" is "+factorial);
        }
    }

}
