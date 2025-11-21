package exc14_OOps_Constructor;

public class Lab115_OOPS_Parameterised_Constructor {
    public static void main(String[] args) {
        car2 c1 = new car2();
        car2 c2 = new car2();
        System.out.println(c1.name);
        System.out.println(c2.name);

        car2 c3 = new car2("Harrier","Tata",2020);
        System.out.println(c3.name);
        car2 c4 = new car2("BOLERO","Mahindra",2000);
        System.out.println(c4.name);

    }
}
class car2{
    String name;
    String model;
    int year;
//DC
    car2(){
        name = "unknown car!!";
        model="XXX";
        year= 1991;
        System.out.println("default constructor");

    }
    car2(String name,String model,int year){
        this.name = name;
        this.model = model;
        this.year = year;

    }

}
