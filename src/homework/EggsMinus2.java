package homework;

import java.util.Arrays;

public class EggsMinus2 {
    public static void main(String[] args) {
        int[] arr = new int[]{60,60,60,60,60,60,60,60,60,60};
//        Arrays.fill(arr,58);
        Arrays.fill(arr,4, 10,58);
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
