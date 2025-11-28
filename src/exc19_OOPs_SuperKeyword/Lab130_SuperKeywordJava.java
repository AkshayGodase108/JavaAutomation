package exc19_OOPs_SuperKeyword;

public class Lab130_SuperKeywordJava {
    public static void main(String[] args) {
        car c1 = new car(100);
        c1.display();
    }
}
class vehicle{
    public int maxSpeed = 180;

    vehicle(){
        System.out.println("Default const");
    }

    vehicle(int a){
        System.out.println("Param Con");
    }
    //method overloading with different argument and same name
    void message(){
        System.out.println("No Return, No Argument");
    }
    void message(int a){
        System.out.println("PC - argument");
    }
    void display(){
        System.out.println("Vehicle parent");
    }
}

class car extends vehicle{
    private int maxSpeed = 281;

    car(){
        super(); //DC
    }
    car (int a){
        super(10); //PC of parent
    }
    // Method Overloading
    @Override
    void display(){
        System.out.println(this.maxSpeed);

        //Parent variable
        System.out.println(super.maxSpeed);
        super.message();
        super.message(10);


        System.out.println("Override");
    }
}