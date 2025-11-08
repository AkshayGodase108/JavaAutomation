package exc09_functions;

import java.util.Scanner;

public class Lab77_arethmetic_function {
    public static void main(String[] args) {
        //if i enter the numbers then there is no problem but if i enter the
        // string then we will get the error so for this we use (hasnextint)>>Edge cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a!");
        int a=0;
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
        }else {
            System.out.println("Enter the int only, ");
            System.exit(0);
        }

        System.out.println("Enter the value of b!");
        int b = 0;
        if(scanner.hasNextInt()){
            b = scanner.nextInt();
        }else{
            System.out.println("Enter the int only.");
            System.exit(0);
        }

        int result_addition = addition(a,b);
        System.out.println(result_addition);
        int result_substraction = substraction(a,b);
        System.out.println(result_substraction);
        int result_multipication = multipication(a,b);
        System.out.println(result_multipication);
        int result_division = division(a,b);
        System.out.println(result_division);
        int result_modulus = modulus(a,b);
        System.out.println(result_modulus);



    }
    static int addition(int a,int b){
        return a+b;
    }
    static int substraction(int a,int b){
        return a-b;
    }
    static int multipication(int a,int b){
        return a*b;
    }
    static int division(int a,int b){
        if(b==0 || a==0){
            System.out.println("Division by zero is not allowed");
            System.exit(0);
        }
        return a/b;
    }
    static int modulus(int a,int b){
        return a%b;
    }
}
