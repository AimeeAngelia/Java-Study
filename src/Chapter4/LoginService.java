package Chapter4;
import java.util.Scanner;
public class LoginService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password;
        do{
            System.out.print("请输入6位数字密码:");
            password = sc.nextInt();
        }while (123456 != password);
        System.out.println("Welcome!");
        sc.close();
    }
}
