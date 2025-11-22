package exc15_OOPs_Inheritance._2_MultilevelInheritance;

public class Lab119_Multilevel_Inheritance_Main {
    public static void main(String[] args) {

        GrandFather gf = new GrandFather();
        gf.gf();

        System.out.println("------------------");

        Father f = new Father();
        f.f();
        f.gf();

        System.out.println("-----------------------");


        son s1 = new son();
        s1.gf();
        s1.f();
        s1.s();
    }
}
