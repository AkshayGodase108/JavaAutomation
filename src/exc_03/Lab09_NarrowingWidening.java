package exc_03;

public class Lab09_NarrowingWidening {
    public static void main(String[] args) {
        int a = 100;
       // byte b = a;//invalid narrowing in widening type casting>> implicit caasting not allowd
        byte b = (byte) a; //explicit casting allowed
        System.out.println(b);

        int c = 200;
        byte d = (byte) c;
        System.out.println(d);

    }
}
