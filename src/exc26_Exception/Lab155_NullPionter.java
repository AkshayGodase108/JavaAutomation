package exc26_Exception;

public class Lab155_NullPionter {

        public static void main(String[] args) {
            String name= null;
            name.trim(); // java.lang.NullPointerException
        }
    }