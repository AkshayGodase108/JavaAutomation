package exc07_For_Loop;

public class Lab54_For_loop_preincre {
    public static void main(String[] args) {
        //For loop ->>>>> reapeat nlock of code thats why loop
        //Help you to repeat a block of code

        //(ICU) - Initialization -> Condition -> updation(incre/decre)


        for(int i=0; i<10; ++i){
            System.out.println(i);
            //Here, using ++i (pre-increment) or i++ (post-increment) gives the same result,
            // - because the increment happens after the print statement in each loop cycle
        }
    }
}
