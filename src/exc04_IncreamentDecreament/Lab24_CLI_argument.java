package exc04_IncreamentDecreament;

public class Lab24_CLI_argument {
    public static void main(String[] args) {
        //take input
        //String to int
        //create configuration
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        String a1 = args[1];
        String a2 = args[2];
        String a3 = args[3];
        System.out.println(age);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
//        int sum = a+b;
//        System.out.println("Sum : "+ sum);

    }
}
