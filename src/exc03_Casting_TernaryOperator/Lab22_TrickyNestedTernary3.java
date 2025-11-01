package exc03_Casting_TernaryOperator;

public class Lab22_TrickyNestedTernary3 {
    public static void main(String[] args) {
        int year = 2024;
        String leap = (year%400==0)? "Leap year":(year%100==0)?"Not a leap year":
                      (year%4==0)?"Leap Year":"Not a leap year";
        System.out.println(year+" is "+leap);

    }
}
