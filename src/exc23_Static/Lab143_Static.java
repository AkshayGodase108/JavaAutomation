package exc23_Static;

public class Lab143_Static {
        public static void main(String[] args) {
            B.commonToAll();
            System.out.println(B.b); //Static belongs to the class so we can directly call method or variable with class name


            B b_ref = new B();
            b_ref.display();
            System.out.println(b_ref.a);




        }

    }




    class B{
        static {
            System.out.println("SIB, called once, class is loaded");
        }
        int a = 10;
        static int b = 10;

        void display(){
            System.out.println(b);
            System.out.println("Non static F(n)");
        }
        static void commonToAll(){
//        System.out.println(a); //in static instance variable not used / call
            System.out.println("Static F(n)");
        }

//    static class C{
//        // Not useful
//    }
    }