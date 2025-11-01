package exc04_IncreamentDecreament;

public class Lab30_Advance_ID1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);

        // Exp A ( a++) Exp B (++a)
        // Expression A -> firstly print then increase     -> 10 but a value after print in 11
        // Expression B -> first increament and then print -> 11 > 12
    }
}
