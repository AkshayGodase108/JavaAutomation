package Tasks;

import java.util.Scanner;

public class Task7_While_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers you want in the Fibonacci series: ");
        int count = scanner.nextInt();

        int first = 0, second = 1, i = 1;

        System.out.print("Fibonacci Series: " + first + " " + second);

        while (i <= count - 2) {   // Already printed 2 numbers
            int next = first + second;
            System.out.print(" " + next);

            // Shift values
            first = second;
            second = next;
            i++;
        }
    }
}
