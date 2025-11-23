package exc15_OOPs_Inheritance._5_Hybrid_Inheritance;

public class Lab122_HybridInheritance {
    //Not possible by using classes
    public static void main(String[] args) {
        sonu s1 = new sonu();
        s1.test();
        s1.test1();
    }
}
class GF{
    void test1(){
        System.out.println("2BHK");
    }
}
class father extends GF{
    void test(){
        System.out.println("Father car");
    }
}
class mother extends GF{}
class sonu extends father{}            // access from one is possible but with both is not possible
//class sonu extends mother{}
//class son extends mother,father{}  //not possible he  will not be able to access the property and method from mother father
