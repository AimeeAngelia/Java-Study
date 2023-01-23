package Chapter5;

import java.util.Arrays;

public class Rakel {
    public static void main(String[] args) {
        String str[] = new String[]{"ab", "cd", "ef", "yz"};
        Arrays.sort(str);
        int index = Arrays.binarySearch(str, 0, 2, "cd");
        System.out.print(index);
    }
}
