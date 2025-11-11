package exc12_Arrays;

public class Lab96_Array_part2 {
    public static void main(String[] args) {
        String[] names = {"Akshay","test","Amit"};
        System.out.println(names.length);

        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);

        String[] names2 = new String[3];
        names2 [0]="jayram";
        names2 [2]="jay";
        names2 [1]="ram";

        System.out.println(names.length);
        System.out.println(names[0]);

        boolean[] is_male_data= new boolean[2];
        is_male_data[0] = true;
        is_male_data[1]=false;
        is_male_data[2]=false;//we have declared 2 elements for this array so it will only allow for 2 outputs

        System.out.println(is_male_data[0]);
        System.out.println(is_male_data[0]);
        System.out.println(is_male_data[2]);



    }
}
