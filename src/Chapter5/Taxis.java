package Chapter5;
import java.util.Arrays;
public class Taxis {
    public static void main(String[] args) {
        int arr[] = new int[]{23, 42, 12, 8};
        Arrays.sort(arr);
        for (int x : arr){
            System.out.print(x);
            System.out.print(" ");
        }
    }
}
