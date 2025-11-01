package exc04_IncreamentDecreament;

public class Lab31_Advance_ID2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // Exp A -> 11 -> increment first and then print thats why -> 11
        // Exp B -> 12 -> increment first and then print thats why -> 12
        // Exp C -> a = 12 as we increased  value of a // we want the value of a not the addition

    }
}
