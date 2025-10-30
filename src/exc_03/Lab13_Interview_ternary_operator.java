package exc_03;

public class Lab13_Interview_ternary_operator {
    public static void main(String[] args) {
        int a = 20;
        String result = a>10? (a>=20? "a>=20":"a<20"):"B";//Nested ternery operator
        System.out.println(result);
    }
}
