package Chapter5;
import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        int arr[] = new int[12];
        for (int x : arr){
            System.out.print(x);
        }System.out.println();
        Arrays.fill(arr,8);
        for (int x : arr){
            System.out.print(x);
        }System.out.println();
    }
}
