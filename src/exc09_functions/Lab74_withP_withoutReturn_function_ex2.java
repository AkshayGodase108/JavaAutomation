package exc09_functions;

public class Lab74_withP_withoutReturn_function_ex2 {
    public static void main(String[] args) {
        //with parameter without return type
        // try this with two number addition
         add_numbers(10,20);
         fullname("Akshay","Godase");


    }

    static void add_numbers(int a, int b){
        int sum = a + b;
        System.out.println("sum of the "+a+" and "+b+" is "+sum);
    }
    static void fullname (String firstname,String lastname){
        System.out.println("your name is ->"+firstname+" "+lastname);
    }
}
