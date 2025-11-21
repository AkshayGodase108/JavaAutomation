package exc14_OOps_Constructor;

public class Lab113_Constructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();  //whenever object is created the Default constructor is called
        new Baby(); //default constructor will call 2 time
        Baby b2; //object is not created its only reference so it will never run default constructor

    }
}

class Baby{
    String name;

    void cry(){
        System.out.println("Cry!!");
    }
    void sleep(){
        System.out.println("Baby is sleeping");
    }
    void eat(){
        System.out.println("Eat!!");
    }
    Baby(){
        System.out.println("I am a default constructor");   //Default constructor once the object is created
        //we can write code here to directly call with the object creation
        //Read file from CSV, XLSX
        // Open a file and read the data (Json, testdata.xlsx, text file)



        }
}
