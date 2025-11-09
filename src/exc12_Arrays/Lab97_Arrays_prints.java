package exc12_Arrays;

import java.util.Arrays;

public class Lab97_Arrays_prints {
    public static void main(String[] args) {
        int[] marks = {90, 100, 92, 91, 92};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("---------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);      //Arrays function ->>>>> to sort the arrays // collection framework//
                           //this class is not part of arrays this is part of collection framework

        System.out.println("---------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}

