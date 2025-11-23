package exc16_Polymorphism.MethodOverloading;

public class Lab125_newExample {

    public int add (int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        Lab125_newExample L1 = new Lab125_newExample();
        L1.add(10,10);
        L1.add(10.2,10.2); //print it using print statement
    }
}
