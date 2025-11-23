package exc16_Polymorphism.MethodOverloading;

public class Lab123_Polymorphism_Overloading {
    public static void main(String[] args) {
        mathOperation m = new mathOperation();
        int r1 = m.add(4,10);
        int r2 = m.add(1,2,3);
        double r3 = m.add(10.11,20.12);

        System.out.println(r1+"\n"+r2+"\n"+r3);

    }
}
class mathOperation{
    // same class we have method with same name but with different arguments

    int add(int a, int b){
        return a+b;
    }
    int add (int a, int b, int c){
        return a+b+c;
    }
    double add (double a , double b){
        return a+b;
    }
}