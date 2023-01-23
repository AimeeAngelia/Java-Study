package Chapter4;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your score:");
        int score = sc.nextInt();
        switch (score){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
            case 6:
                System.out.println("C");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("D");
                break;
            default:
                System.out.println("Please input the right score and try again...");
        }
        sc.close();
    }
}
