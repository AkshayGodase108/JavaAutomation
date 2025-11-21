package exc14_OOps_Constructor;

public class Lab115_DC_Constructor_example {
    public static void main(String[] args) {
        Car c1 = new Car();           //when we run it without adding any values then we use the default constructor to add default value
        System.out.println(c1.name );      //when we run it without adding any values to variables we get the default value as "Null or 0"
        System.out.println(c1.year );
        System.out.println(c1.model );

        System.out.println("------------------");

        Car c2 = new Car();                 //using the DC every object will have same default value from the Default constructor
        System.out.println(c1.name );
        System.out.println(c1.year );
        System.out.println(c1.model );
    }
}
class Car{
    String name;
    int year;
    String model;

    Car(){                          //we use the default constructor to add default value
        name = "Unknown Car";
        year = 1991;
        model = "XXX";
    }
}
