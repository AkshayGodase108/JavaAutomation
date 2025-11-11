package Tasks;

public class Task09_array_2ndhighest_numbr_withoutusingArrayfunction {
    public static void main(String[] args) {
        int[] numbers = {10,50,70,74,90,89,91};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        // using normal for loop
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                secondHighest = highest;
                highest = numbers[i];
            } else if (numbers[i] > secondHighest && numbers[i] < highest) {
                secondHighest = numbers[i];
            }
        }

        System.out.println("Second highest number is: " + secondHighest);
    }
}
