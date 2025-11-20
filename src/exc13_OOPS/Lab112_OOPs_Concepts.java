package exc13_OOPS;

public class Lab112_OOPs_Concepts {
    public static void main(String[] args) {
        Person amit;
        Person P1 = new Person();
        //Person -> Class
        //P1 -> ref name
        // new Person() ->>>> Object
        P1.name="Lucky";


    }
}
class Person{
    //Attribute | Properties | Data Members | Instance Variable
       String name;
       String phone;
       String Eye_color;
       int legs;
       double salary;
       byte age;
       boolean Is_male;

    //Behavior | functions | Method

    void sleep(){
        System.out.println("i am sleeping");
    }

    String greet(){
        return "Hello"+name;
    }
    void talking(){
        System.out.println("I am talking");
    }

    int remaining_aamount_salary(int salary, int tax){
        return salary-tax;
    }


}