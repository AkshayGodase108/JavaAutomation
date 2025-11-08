package Tasks;


import java.util.Scanner;

public class Task8_While_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number that you want to print from the Fibonacci : ");
        int count = scanner.nextInt();

        int first = 0;
        int second = 1;
        if(count==1){
            System.out.println("Fibonacci series: "+ first );
        }else{
            System.out.print("Fibonacci series: " + first + " " + second);
        }
        int i = 1;
        while (i<=count - 2){
            int next = first + second;
            System.out.print(" " +next);

            first = second;
            second = next;
            i++;

        }
    }
}