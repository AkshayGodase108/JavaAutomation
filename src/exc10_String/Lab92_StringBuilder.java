package exc10_String;

public class Lab92_StringBuilder {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("Akshay");
        s1.append(" Godase");
        System.out.println(s1);// previous string was deleted and new one stored to s1 ->>change is occur thats why its
                               //mutable in nature ->>value changed
        System.out.println(s1);
        System.out.println(s1.reverse());
        System.out.println(s1.delete(7,13)); //delete 7 to 12 characters
        System.out.println(s1);
        System.out.println(s1.insert(7,"yahskA"));
        System.out.println(s1.reverse());
        System.out.println(s1.replace(7,12,"Hari Godase"));//replace 7 to 12 characters

    }
}
