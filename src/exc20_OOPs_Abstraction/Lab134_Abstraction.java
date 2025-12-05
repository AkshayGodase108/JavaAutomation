package exc20_OOPs_Abstraction;

public class Lab134_Abstraction {
    public static void main(String[] args) {
        c1 c = new c1("Akshay", "Pandharpur", 992272986);
        System.out.println(c.computePay());
        c.mailCheck();
    }
}

abstract class Employee{

    private String name;
    private String address;
    private int number;

    Employee(){
        System.out.println("DC");
    }
    Employee(String name, String address, int number){
        System.out.println("constructing an Employee");
        this.name = name;
        this.address = address;
        this.number=number;
    }

    abstract double computePay();

    void mailCheck(){
        System.out.println("Mailing a check to "+this.name+" "+this.address+" "+this.number);
    }
}
class c1 extends Employee{


    c1(String name, String address, int number) {
        super(name,address,number);   // 👈 sends data to Employee constructor
    }
    @Override
    double computePay() {
        return 50000;
    }
} //this class hide the employee