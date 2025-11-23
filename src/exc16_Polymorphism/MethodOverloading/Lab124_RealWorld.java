package exc16_Polymorphism.MethodOverloading;

public class Lab124_RealWorld {

    public static void main(String[] args) {
        home h = new home();
        h.task(10);
        h.task(10,20);
        h.task(3,4,5);
    }
}
class home{

    void task(int a){
        System.out.println("Task of A");
    }
    void task(int a, int b){
        System.out.println("task of the a & b " +(a+b));
    }
    void task(int a, int b , int c){
        System.out.println("Task of the abc is "+(a+b+c));
    }

}