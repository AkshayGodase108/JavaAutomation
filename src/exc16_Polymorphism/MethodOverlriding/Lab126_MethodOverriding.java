package exc16_Polymorphism.MethodOverlriding;

public class Lab126_MethodOverriding {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();


    }

}
class animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class dog extends animal {
    void sound(){
        System.out.println("Bark!!");
    }
}
