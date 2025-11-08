package exc09_functions;

public class Lab74_withP_withoutReturn_function {
    public static void main(String[] args) {
        //with parameter without return type

        greet_with_details("Akshay",20,100000);
        greet_with_details("Abhay",30,150000);
        fullname("Akshay","Godase");

    }

    static void greet_with_details(String name, int age, float salary){
        System.out.println("Your name is -> "+name + "\nYour age is -> "+age+"\nYour salary is -> "+salary);
    }
    static void fullname (String firstname,String lastname){
        System.out.println("your name is ->"+firstname+" "+lastname);
    }
}
