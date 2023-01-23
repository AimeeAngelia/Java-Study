package Chapter5;

import java.util.Arrays;

public class Display {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,};
        Arrays.fill(arr,2,6,0);
        for (int x = 0; x<arr.length; x++){
            System.out.print(arr[x]);
        }
    }
}
