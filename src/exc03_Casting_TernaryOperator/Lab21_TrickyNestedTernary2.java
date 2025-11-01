package exc03_Casting_TernaryOperator;

public class Lab21_TrickyNestedTernary2 {
    public static void main(String[] args) {
        int x = 12, y = 3, z = 20;
        int min = (x<y)?(x<z)? x:z:(y<z)? y:z;
        String varname = (min==x)? "x": (min==y)? "y":"z";
        System.out.println("Min number is "+varname+"="+min);

    }
}
