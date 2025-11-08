package exc09_functions;

public class Lab70_Simple_method {
    public static void main(String[] args) {
        int result = a();
        System.out.println(result);
        boolean test = c();
        System.out.println(test);
        float test1 = f();
        System.out.println(test1);

    }
    static int a() {
        return 100;
    }
    static float f(){
        return 100.201f;
    }
    static boolean c(){
        return true;
    }
}
