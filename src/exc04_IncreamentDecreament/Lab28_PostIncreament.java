package exc04_IncreamentDecreament;

public class Lab28_PostIncreament {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        // line no / a / b
        //  5     / 10 / NA
        //  6     / 11 / 10
        //  7     / 11 / NA
        //  8     / 11 / 10
    }
}
