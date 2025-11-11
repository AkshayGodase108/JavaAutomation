package exc12_Arrays;

import java.util.Scanner;

public class Lab109_2d_multiplicationtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfTable = scanner.nextInt();

        for(int i = 0; i<sizeOfTable; i++){
            for(int j=0; j< sizeOfTable; j++){
//                System.out.print(i + "X" +j+ "=" +(i*j)+ "\t\t");
                System.out.print((i*j)+ "\t");
            }
            System.out.println();
        }


    }
}
