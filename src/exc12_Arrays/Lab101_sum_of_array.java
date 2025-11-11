package exc12_Arrays;

public class Lab101_sum_of_array {
    public static void main(String[] args) {

        int[] numbers = {12,34,56};
        int sum1 = 0;

        System.out.println("--------");
        for(int i=0; i<numbers.length; i++){
            sum1 = sum1 + numbers[i];
        }
        System.out.println(sum1);

        System.out.println("---------"); //for each loop
        int sum2 = 0;
        for(int n : numbers){   // Enhanced for loop
            sum2 = sum2 + n;
        }
        System.out.println(sum2);
    }
}
