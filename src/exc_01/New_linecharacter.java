package exc_01;

public class New_linecharacter {
    static void main(String[] args) {
        char new_line = '\n';
        char back_space = '\b';//rarely used
        char tab_line = '\t';
        char carriage_return = '\r';
        System.out.println("Akshay"+new_line+"Godase");
        System.out.println("Akshay"+tab_line+"Godase");
        System.out.println("Akshayyy"+back_space+"Godase");
        System.out.println("Akshay test"+carriage_return+"Godase");
        System.out.println("Akshay Hari godase\npandharpur\nsolapur");
        System.out.println("Akshay" + " " +"Godase");
    }
}
