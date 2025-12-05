package exc20_OOPs_Abstraction;

public class Lab133_Abstraction {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.drive();
    }
}

abstract class Engine{

    abstract void startEngine();
    abstract void stopEngine();

}

class WagonR extends Engine{

    void startEngine(){
        System.out.println("Starting the car!");
    }

    void stopEngine(){
        System.out.println("Stoping the car!");

    }
    void drive(){
        startEngine();
        stopEngine();
    }

} //complete class - no abstract method