package exc26_Exception;

public class Lab163_IQ1 {

        public static void main(String[] args) {
            int c =0;
            int b = 0;
            try {
                b = 10/c; // Vulnerable Code that should be try and catch!
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }
    }