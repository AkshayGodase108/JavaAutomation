package exc03_Casting_TernaryOperator;

public class Lab23_TrickyNestedTernary4 {
    public static void main(String[] args) {
        int score=3;
        String rating = (score==5)?"Excellent":(score==4)?"Good":
                   (score==3)?"Average": (score==2)?"Poor":"Fail";
        System.out.println(score +" Rating :"+" "+ rating);
    }
}
