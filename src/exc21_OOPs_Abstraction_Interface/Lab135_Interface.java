package exc21_OOPs_Abstraction_Interface;

public class Lab135_Interface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(10,10);

        Square s1 = new Square();
        s1.getArea(3,4);
    }
}
interface polygon{
    void getArea(int length, int breadth);
}
class Square implements polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area od Square -> "+3.14*length*breadth);
    }
}
class Rectangle implements polygon{
    public void getArea(int length, int breadth){
        System.out.println("The area of rectangle is " + (length * breadth));
    }
}