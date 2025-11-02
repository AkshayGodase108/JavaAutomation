package exc06_Switch;

import java.util.Scanner;

public class Lab39_SwitchStatement_WithoutBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day value from 1 to 7");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("saturday");
            case 7:
                System.out.println("Sunday");


        }
    }

}
