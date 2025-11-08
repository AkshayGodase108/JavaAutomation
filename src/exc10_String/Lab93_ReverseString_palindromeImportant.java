package exc10_String;

import java.util.Scanner;

public class Lab93_ReverseString_palindromeImportant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input , i will check palindrome");
        String userInput = sc.next();         //sc.next for String
        String newstring = reversestring(userInput);
        System.out.println("reversed String : "+ newstring);

        if (newstring.equalsIgnoreCase(userInput)) {
            System.out.println("its palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    private static String reversestring(String userInput) {
        String reversed = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed = reversed + userInput.charAt(i);
        }
        return reversed;
    }
}