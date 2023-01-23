package Chapter4;
import java.util.Scanner;
public class ScoreGrade {
    public static void main(String[] args) {
        System.out.print("Please input your score:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score>=90){
            System.out.println("A");
        }else if (score>=80){
            System.out.println("B");
        } else if (score>=60) {
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}
