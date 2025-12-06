package exc26_Exception;

public class Lab157_ExceptionHandle {
    public static void main(String[] args){
//             int a = 0;
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
