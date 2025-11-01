package exc02_Operators;

public class Lab05_Logical_Operator {
    public static void main(String[] args) {

        int akshay_salary = 10;
//        int vijay_salery = 20;
        boolean a = akshay_salary<12 || akshay_salary>12;
        boolean b = akshay_salary==10 && akshay_salary<12;
        boolean c = akshay_salary==10 && akshay_salary>12;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    }
