package exc04_IncreamentDecreament;

public class Lab25_Increament_operator {
    public static void main(String[] args) {
        //Pre-increament -> ++operand
        //  Value is increamented first and then stored in the result
        //   value increased by 1
        int a = 10;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);

        //expression and result table
        //Line no  / a /  result b
        //  8     / 10 /   NA
        //  9     / 11 /   11
        //  10    / 11(NA) /   11                (NA - not printing)
        //  11    / 11 /   11(NA)                (NA - not printing)


    }

}