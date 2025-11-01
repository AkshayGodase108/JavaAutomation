package Tasks;

public class Task4_CLIOptions2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String OddorEven = (a%2==0)? "even":"Odd";
        System.out.println(a+" is "+OddorEven+ " number");
    }
}
