package Tasks;

import java.util.Scanner;

public class Task6_TriangleClassifier_HackerRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter slide1 length");
        int slide1 = scanner.nextInt();
        System.out.println("Enter slide2 length");
        int slide2 = scanner.nextInt();
        System.out.println("Enter slide3 length");
        int slide3 = scanner.nextInt();
        if (slide1==slide2 && slide2==slide3){
            System.out.println("the triangle is equilateral");
        }else if (slide1==slide2 || slide2==slide3 || slide1==slide3){
            System.out.println("the triangle is isosceles");
        }else{
            System.out.println("the triangle is a scalene");
        }
    }
}
