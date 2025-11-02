package exc06_Switch;

import java.util.Scanner;

public class LAb42_RealSwitch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser = scanner.next();

        switch(browser){
            case "chrome":
                System.out.println("www.google.com");
                System.out.println("www.test.com");
                System.out.println("testcase1 ");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("jahs");
                System.out.println("www.google.com");
                System.out.println("ettsb");
                break;
            case "edge":
                System.out.println("ABC");
                break;
            default:
                System.out.println("i don't have idea about this browser");
                break;
        }


    }
}
