package exc_03;

public class Lab20_TrickyNestedTernary1 {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 5;
        int max = (a>b)?(a>c)?a:c:(b>a)?b:c;
        String varname = (max==a)?"a":(max==b)?"b":"c";
        System.out.println("max number is "+varname+"="+max);
    }
}
