package Junk;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 25, 10};
        Arrays.sort(arr);
        for (int x : arr){
            System.out.print(x+" ");
        }
        int index = Arrays.binarySearch(arr, 0, 3, 8);
        System.out.print(index);
    }
}
