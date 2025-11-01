package exc03_Casting_TernaryOperator;

public class Lab10_Typecasting {
    public static void main(String[] args) {
        int course = 200;
        float GST = 18.50f;
      int total = course + (int)GST;  // Narrowing implicit not allowed
        System.out.println(total);
        float total1 = course + GST; // widening auto implicit
        System.out.println(total1);
        float total2 = (float) course+GST;
        System.out.println(total2);
    }
}
