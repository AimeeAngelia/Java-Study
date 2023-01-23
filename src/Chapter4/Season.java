package Chapter4;
import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        System.out.print("Please input one month to get the corresponding season:");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month) {
            case 2, 3, 4 -> System.out.println("Spring");
            case 5, 6, 7 -> System.out.println("Summer");
            case 8, 9, 10 -> System.out.println("Autumn");
            case 11, 12, 1 -> System.out.println("Winter");
            default -> System.out.println("Please input one right month to get corresponding season...");
        }
        }
    }
