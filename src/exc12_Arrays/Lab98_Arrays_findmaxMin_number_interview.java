package exc12_Arrays;

public class Lab98_Arrays_findmaxMin_number_interview {
    public static void main(String[] args) {
        int[] array = {25,14,45,67,23,54,78,90,24,49};
        //can we take the input from the user also? = yes - later
        // max and min

        int max_output= give_me_max(array);
        System.out.println(max_output);
        int min_output = give_me_min(array);
        System.out.println(min_output);


    }


    private static int give_me_max(int[] array) {
        int max = array[0];
        for (int i=0; i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;

    }
    private static int give_me_min(int[] array) {
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }


}
