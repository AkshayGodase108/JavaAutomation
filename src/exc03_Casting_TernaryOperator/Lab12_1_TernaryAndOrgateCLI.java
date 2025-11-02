package exc03_Casting_TernaryOperator;

public class Lab12_1_TernaryAndOrgateCLI {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        String result = (a == b && b == c) ? "iquilateral triangle" : (a == b || b == c || a == c) ? "isosceles" : "scalene";
        System.out.println(result);
    }
}