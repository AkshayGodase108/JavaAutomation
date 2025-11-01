package Tasks;

public class Task4_CLIOptions1 {
    public static void main(String[] args) {
        String num1_string = args[0]; //firstly we are storing the command line into the string then converting into int
        String num2_string = args[1];
        int num1 = Integer.parseInt(num1_string);
        int num2 = Integer.parseInt(num2_string);
        int max = (num1>num2)? num1 : num2;
        System.out.println("Num 1 is : "+num1);
        System.out.println("Num 2 is : "+num2);
        System.out.println("Maximum number from the above 2 numbers is : "+max);

        //* for the same question we can write the program in the another way
        //* its just skip the middle step of storing them in separate string variable

//        int num1 = Integer.parseInt(args[0]);
//        int num2 = Integer.parseInt(args[1]);
//        int max = (num1 > num2) ? num1 : num2;
//
//        System.out.println("Num 1: " + num1);
//        System.out.println("Num 2: " + num2);
//        System.out.println("Maximum: " + max);

    }
}
