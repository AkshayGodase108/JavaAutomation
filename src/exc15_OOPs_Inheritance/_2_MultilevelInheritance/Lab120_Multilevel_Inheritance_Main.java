package exc15_OOPs_Inheritance._2_MultilevelInheritance;

public class Lab120_Multilevel_Inheritance_Main {
    public static void main(String[] args) {

//          Father f = new GrandFather();
//          son s1 = new GrandFather();
//          son s1 = new Father();



        GrandFather gf = new Father(); //Dynamic Dispatch  //only object method will call with this that is object details
        gf.gf();
//        gf.f();                      // only call the common funcgtions only
        Father f1 = new son();
        GrandFather gf1 = new son();

//        WebDriver driver = new ChromeDriver();
    }
}
