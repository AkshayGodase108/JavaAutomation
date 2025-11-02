package exc03_Casting_TernaryOperator;

import java.util.Scanner;

public class Lab122_TernaryAndORScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a side length");
        int a = scanner.nextInt();
        System.out.println("Enter the b side side length");
        int b = scanner.nextInt();
        System.out.println("Enter the c side side length");
        int c = scanner.nextInt();
        String result = (a==b && b==c)?"the triangle is equilateral":
        (a==b || b==c || c==a)?"the triangle is isosceles":"the triangle is scalene";
        System.out.println(result);

    }
}
