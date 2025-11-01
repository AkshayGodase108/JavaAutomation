package Tasks;

public class Task4_CLIOptions {
    public static void main(String[] args) {
        String name_string = args[0];
        String salary_string = args [1];
        String age_string = args[2];
        int salary = Integer.parseInt(salary_string);
        int age = Integer.parseInt(age_string);
        System.out.println("Name : "+name_string);
        System.out.println("Salary : "+salary);
        System.out.println("Age : "+age);

    }
}
