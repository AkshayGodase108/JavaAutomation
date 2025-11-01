package exc05_If_Else;

public class Lab35_if_CLI {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);  // CLI option
        if (age>18){
            System.out.println("Yes, you are allowed to vote");
        }
        else {
            System.out.println("No, You are not allowed to vote as your age is "+age+"\nyou are must be an adult that means your age should be more than or equal to 18 years");
        }
    }
}
