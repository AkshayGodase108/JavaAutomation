package Tasks;

public class Task3_IncreamentDecreament1 {

           public static void main(String[] args) {
            int a = 20;
            System.out.println(--a + a++ + a--);
               //decrement first so EXP A-> 19 , Exp B-> 19 (As print first) then increment
               // after Exp B -> its 20 so Expression C -> 20 (before decrement)
               // 19 + 19 + 20 = 58
               System.out.println(a); // it will be 19 after Exp C run
        }
    }