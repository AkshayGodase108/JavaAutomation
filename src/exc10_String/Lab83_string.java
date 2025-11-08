package exc10_String;

public class Lab83_string {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "test";
        //how many strings available in the SCP ->>>2
        String s4 = new String("hello");
        String s5 = new String("hello");
        String s6 = new String("hello");
        //how many strings available in the SCP ->>>3(Hello, test, hello)
        //how many strings available in the heap->> 3(hello1,hello1,hello1)

        //total string objects are 6

    }
}
