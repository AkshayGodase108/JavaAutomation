package exc03_Casting_TernaryOperator;

public class Lab14_TernaryOperator {
    public static void main(String[] args) {
        //find the maximum number between two numbers
        int x = 20;
        int y = 30;
        System.out.println(Math.max(x,y));
        int max = x>y? x:y;
        System.out.println("maximum number is " + max);
    }
}
