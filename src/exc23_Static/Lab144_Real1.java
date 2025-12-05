package exc23_Static;

public class Lab144_Real1 {     //made by me
    public static void main(String[] args) {

        System.out.println(AT.coursename);
        System.out.println(AT.mentorname);

        AT.doassignment();
        AT.joinzoomclass();

        AT A = new AT();
        A.setName("Akshay");
        A.setPhone("9922729863");

        System.out.println(A.getName());
        System.out.println(A.getPhone());

        AT B = new AT();
        B.setName("Dipak");
        B.setPhone("9552349863");

        System.out.println(B.getName());
        System.out.println(B.getPhone());


    }
}

class AT{
    static{
        System.out.println("This line will execute first");
    }
    {
        System.out.println("IIB is called when Object is created!");
    }
    private String name;
    private String phone;
    static String coursename = "ATB11X";
    static String mentorname = "PRAMOD";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    static void doassignment(){
        System.out.println("Do your assignment daily which created at platform");
    }
    static void joinzoomclass(){
        System.out.println("Class joined!!");
    }

}