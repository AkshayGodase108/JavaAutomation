package Tasks;

public class Task11_ClassObject {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name="akshay";
        System.out.println(p1.name);
        System.out.println(p1.walk());
        System.out.println(p1.eye_colors());
        p1.greet_with_details("akshay",10,2000f);
        System.out.println(p1.test("BA","Male"));
        p1.test1();                 //for printing out the without parameter and without return method

    }
}
class Person {
    String name;
    byte age;
    short salary;
    int phone;
    double hight;
    String occupation;
    String Gender;
    int leg;
    String eye_color;
    String sleep;

    boolean walk() {
       // System.out.println("i am walking");
        return false;
    }

    static String eye_colors() {
        return ("Brown");
    }

    void greet_with_details(String name, int age, float salary) {
        System.out.println("Your name is -> " + name + "\nYour age is -> " + age + "\nYour salary is -> " + salary);

    }
    String test (String occupation, String Gender){
        return "occupation: " +occupation+ " | Gender: " + Gender;
    }
    void test1(){
        System.out.println("I will test");
//        return "I will test";         ---->>>>>void method doesn't return anything
    }
}
