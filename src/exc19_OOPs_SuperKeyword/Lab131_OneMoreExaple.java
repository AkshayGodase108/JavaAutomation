package exc19_OOPs_SuperKeyword;

public class Lab131_OneMoreExaple {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.display();
    }


}
class animal{
    protected String color= "White";

    void sound(){
        System.out.println("animal sound");
    }
    }
    class dog extends animal{
    private String color = "Black";

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
    }