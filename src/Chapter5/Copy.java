package Chapter5;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int arr[] = new int[]{23, 42, 12};
        int newarr[] = Arrays.copyOf(arr, 5);
        for (int x : newarr){
            System.out.print(x+" ");
        }
    }
}
