package exc26_Exception;

import java.util.Scanner;

public class Lab165_Try_Catch_Finally {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int b= 10/v;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("end of program , sc closed!");
        }

    }
}