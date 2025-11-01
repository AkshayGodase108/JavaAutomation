package exc03_Casting_TernaryOperator;

public class Lab18_TO_GradeTask {
    public static void main(String[] args) {
        int marks = 83;
        String grade = (marks >= 90) ? "A" : (marks >= 80) ? "B" : (marks >= 70) ? "C" : "D";
        System.out.println("Grade: " + grade);

    }
}
