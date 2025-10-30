package exc_03;

public class Lab19_RealAgeClassification {
    public static void main(String[] args) {
        // age = 23 -> Adult (age>), minor (age<18), senior(age>65)
        // take input from user
        String age1 = args[1];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);


        String result = (age<18)? "minor" : (age>65)? "senior citizen":"Adult";
        System.out.println("User is "+result);


    }
}
