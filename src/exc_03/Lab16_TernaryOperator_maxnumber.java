package exc_03;

public class Lab16_TernaryOperator_maxnumber {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        int n3 = -5;
        int max = (n1>n2)?(n1>n3)? n1:n3:(n2>n3)?n2:n3;
        System.out.println("Maximum number is "+max);
    }
}
