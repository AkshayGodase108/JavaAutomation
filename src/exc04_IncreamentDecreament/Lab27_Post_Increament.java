package exc04_IncreamentDecreament;

public class Lab27_Post_Increament {
    public static void main(String[] args) {
        //print first and then increase
        int a = 200;
        System.out.println(a++);
        System.out.println(a);

        int c = 10;
        int d = c++;
        System.out.println("value of d "+d);
        System.out.println("value of c "+c);

    }
}
