package exc06_Switch;

import java.util.Scanner;

public class Lab49_aboveJDK13 {
    public static void main(String[] args) {
        // we have to close the scanner at the end of the programme
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the code");
        int a = scanner.nextInt();
        switch(a){
            case 1,2,3,4:
                System.out.println("Execute 4 test cases 1 to 4");
                break;
            case 5,6,7,8:
                System.out.println("run 5 to 8 test cases");
                break;
            default:
                System.out.println("Invalid test execution");
                break;

        }
        scanner.close();
    }
}
