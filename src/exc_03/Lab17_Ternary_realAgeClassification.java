package exc_03;

public class Lab17_Ternary_realAgeClassification {
    public static void main(String[] args) {
        int age = 17;
        String result = (age < 18) ? "minor" : (age >= 65) ? "sinior citizon" : "Adult";
        System.out.println("User is " + result);
    }
}
