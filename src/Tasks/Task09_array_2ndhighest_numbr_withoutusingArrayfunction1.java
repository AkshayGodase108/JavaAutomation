package Tasks;

public class Task09_array_2ndhighest_numbr_withoutusingArrayfunction1 {
    public static void main(String[] args) {
        int[] numbers = {10,50,40,74,70,89,80};

        int highest = 0;
        int secondhighest = 0;

        if(numbers[0]>numbers[1]){
            highest = numbers[1];
            secondhighest = numbers[1];
        }else{
            highest = numbers[1];
            secondhighest = numbers[0];
        }
        for(int i=2; i<numbers.length;i++){
            if (numbers[i]>highest){
                secondhighest = highest;
                highest = numbers[i];
            } else if (numbers[i]>secondhighest && numbers[i]<highest) {
                secondhighest=numbers[i];
            }
        }
        System.out.println("second highest number is :"+secondhighest);
        System.exit(0);
    }
}
