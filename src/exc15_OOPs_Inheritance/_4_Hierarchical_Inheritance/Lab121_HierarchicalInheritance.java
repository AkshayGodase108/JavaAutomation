package exc15_OOPs_Inheritance._4_Hierarchical_Inheritance;

public class Lab121_HierarchicalInheritance {
    public static void main(String[] args) {
        father1 f1 = new father1();
        f1.home();

        System.out.println("-----------------");

        akshay a = new akshay();
        a.car();
        a.home();

        System.out.println("-----------------");

        sama s = new sama();
        s.motorcycle();
        s.home();

        System.out.println("-------------------");

        madhuri m = new madhuri();
        m.cycle();
        m.home();

    }
}

class father1{
    void home(){
        System.out.println("2BHK Home");
    }
}

class akshay extends father1{
    void car(){
        System.out.println("Test the car");
    }
}

class sama extends father1{
    void motorcycle(){
        System.out.println("Motorcycle riding");
    }
}
class madhuri extends father1{
    void cycle(){
        System.out.println("New Cycle");
    }
}