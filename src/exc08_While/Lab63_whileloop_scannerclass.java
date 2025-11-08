package exc08_While;

import java.util.Scanner;

public class Lab63_whileloop_scannerclass {
    public class Lab62_WhileLoop {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the value of a : ");
            int a = scanner.nextInt();
            while (a<10){
                System.out.println(a);
                a++;
            }
        }
    }
}
