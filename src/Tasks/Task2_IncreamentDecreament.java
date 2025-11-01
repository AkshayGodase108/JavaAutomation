package Tasks;

public class Task2_IncreamentDecreament {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        // Exp A -> 11 --- Exp B-> 11---- Exp C -> 12 ->>>> 11+12+12=34
        System.out.println(a);
        // Exp D -> after expression c value of the a is become 13 because post increment i.e 12 to 13 ->>>>13
    }
}
