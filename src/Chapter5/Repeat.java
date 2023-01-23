package Chapter5;

import java.util.Arrays;

public class Repeat {
    public static void main(String[] args) {
        int arr[] = new int[]{23,42,12,84,10};
        int newarr[] = Arrays.copyOfRange(arr, 0, 30);
        for (int i = 0; i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
