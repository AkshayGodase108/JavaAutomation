package exc12_Arrays;

import java.util.Scanner;

public class Lab108_2D_rightTriangle {
    public static void main(String[] args) {
        //how the pattrn we want
        // n = 3
        // *
        // **
        // ***

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            for(int j = 0; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}

