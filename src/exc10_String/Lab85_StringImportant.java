package exc10_String;

public class Lab85_StringImportant {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        //SCP always stores unique literals only once
        //if added unique name then add it in the heap ->>heap is used only when you explicitly use "new String()"

        System.out.println(str1 == str2); // "==" checks the location
        System.out.println(str1 == str3); //location is not same s3 created in the heap
        System.out.println(str1.equals(str3)); // "equals" check the value


    }
}
