package exc14_OOps_Constructor;

public class Lab114_Constructor_DefaultCostru {
    public static void main(String[] args) {
        A a = new A();
    }
}
   class A{
    A(){                                //whether we want to create it or not it will by-default added by the java
        System.out.println("DC");      // it take the name of the Class // is important
    }


   }