package exc20_OOPs_Abstraction;

public class Lab132_Abstraction {
    public static void main(String[] args) {

        child c = new child();
        c.loan25k();
        c.loan50k();

       // father f1 = new father();  we cant create instance of father because incomplete in nature because abstract
        father f1 = new child();
    }
}

abstract class father{

    abstract void loan50k();

    void loan25k(){
        System.out.println("Given 25k");
    }
}

class child extends father{
    @Override

    void loan50k(){

    }

}