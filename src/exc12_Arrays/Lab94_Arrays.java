package exc12_Arrays;

public class Lab94_Arrays {
    public static void main (String[] args){
         int a = 10;
         int[] marks={90,100,92,91,92,89,51};
        System.out.println(marks.length); //->>>>> not class so we not mention arr.length() ((its metnions in string.length()
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        System.out.println(marks[6]);
        System.out.println(marks[10]); //-> throw exceptions
        System.out.println(marks[-1]); //-> throw exceptions

    }
}
