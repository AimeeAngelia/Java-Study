package Chapter5;

import java.util.Arrays;

public class Reference {
    public static void main(String[] args) {
        int ia[] = new int[]{1, 8, 9, 4, 5};
        Arrays.sort(ia);
        int index = Arrays.binarySearch(ia, 40);
        System.out.print("The index of 4 is "+index);
    }
}
