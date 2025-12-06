package exc26_Exception;

public class Lab158_TryCatch {
    public static void main(String[] args) {
        System.out.println("Start the program");
        try {
            int a = 10 / 0;
        }catch (Exception e){
            System.out.println("Devide by zero not possible");
        }
        System.out.println("Stop the program");
    }
}
