package exc10_String;

public class Lab79_String {
    public static void main(String[] args) {
        String name = "Akshay";
        name.toUpperCase();        //we have to store it in the name
       name = name.toUpperCase();
        System.out.println(name);
        //the uppercase string will store in new heap/scp and cannot changing previous value
        //String count in the SCP is 1
        // That's why strings are immutable in nature

    }
}
