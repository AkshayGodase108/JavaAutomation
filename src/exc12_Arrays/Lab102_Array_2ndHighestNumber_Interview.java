package exc12_Arrays;

import java.util.Arrays;

public class Lab102_Array_2ndHighestNumber_Interview {
    public static void main(String[] args) {
        int[] numbers = {12,54,23,23,24,56,24,1};
        //56,54
        Arrays.sort(numbers);     // interviewer dont wnat to allow use this
        System.out.println(numbers[numbers.length-2]);
        System.out.println(numbers[numbers.length-3]);
    }
}
