package exc06_Switch;

import java.util.Scanner;

public class Lab48_aboveJDK13 {
    public static void main(String[] args) {
        //in JDK > 13
        //No break statement required
        //int itemcode = 11;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ItemCode");
        int itemcode = scanner.nextInt();
        switch (itemcode){
            case 11 -> System.out.println("Test1");
            case 22 -> System.out.println("Test2");
            case 33 -> System.out.println("Test3");
            default -> System.out.println("Do Not test");

        }
    }
}
