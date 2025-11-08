package exc10_String;

public class Lab87_String_CommonFunctions {
    public static void main(String[] args) {
        String name = "Akshay";

        System.out.println(name.concat("Godase"));                       //concat
        System.out.println(name.contains("ase"));                            //contains
        System.out.println(name.equals("akshay"));                           //equals
        System.out.println(name.equalsIgnoreCase("akshay"));     //equalsignorecase
        System.out.println(name.indexOf(0));                                 //indexof
        System.out.println(name.replace("y","Y"));          //replace
        System.out.println(name.replace("kshay","KSHAY"));  //replace
//Split
        String name1 = "anuj@live.com@123";
        String[] split = name1.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
//substring
        System.out.println(name1.substring(1,5));    //-->>Give values from 1 to 4 index// ignore number 5
//starts with
        System.out.println(name1.startsWith("c"));
//endswith()
        System.out.println(name.endsWith("y"));
//trim
        String name2 = "  akshay godase";
        System.out.println(name2.trim());      //removes the front space
        String name3 = "  akshay godase";
        System.out.println("Before trim name3:>"+name3);
        String trimname3 = name3.trim();
        System.out.println("After trim name3:>"+trimname3);
//compare to
        System.out.println(name.compareTo("Akshay1"));






    }
}
