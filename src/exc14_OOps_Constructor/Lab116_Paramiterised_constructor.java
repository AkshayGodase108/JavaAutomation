package exc14_OOps_Constructor;

public class Lab116_Paramiterised_constructor {
    public static void main(String[] args) {
        // its used to initialise the value during the object creation

        person p1 = new person("Amit",992272986,"test address");
        System.out.println(p1.name);
        person p2 = new person("Akshay",922729861,"test address");

        person p3 = new person();
        p3.name="ajay";
        System.out.println(p3.name);


        p1.eat();
        p2.eat();
        p3.eat();
    }
}

class person{
    String name;
    long phone;
    String address;

    person(){

    }

    person(String name_arg, long phone_arg, String address_arg){
        this.name=name_arg;
        this.phone=phone_arg;
        this.address=address_arg;

    }
    void eat(){
        System.out.println(this.name + " is eating!!");
    }

}
