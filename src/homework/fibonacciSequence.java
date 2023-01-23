package homework;

import java.util.Scanner;

public class fibonacciSequence {
    public static void main(String[] args) {
        System.out.print("n=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 1;
        int num2 = 1;
        int temp;
        switch (n){
            case 1,2-> System.out.println("The number is 1.");
            default-> {
                for (int t = 3;t<=n;t++){
                    temp = num1+num2;
                    num1 = num2;
                    num2 = temp;
                }System.out.println("The number is "+num2+".");
            }

        }
        sc.close();
    }
}
