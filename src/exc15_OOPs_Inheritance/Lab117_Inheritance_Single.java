package exc15_OOPs_Inheritance;

import org.w3c.dom.ls.LSOutput;

public class Lab117_Inheritance_Single {
    public static void main(String[] args) {
        father f1 = new father();
        System.out.println(f1.gold);
        f1.bhk2();
//        f1.bhk3();

        son s1 = new son();
        s1.bhk3();
        s1.bhk2();

    }
}

class father {

    int gold = 1000;  //attributes | data variable | Property | Instance variable

    void bhk2(){         //Behavior | method | Function | Data members
        System.out.println("2BHK");
    }
}

class son extends father{

    void bhk3(){
        System.out.println("3BHK son");
    }
    

}