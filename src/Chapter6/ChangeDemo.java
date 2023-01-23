package Chapter6;

public class ChangeDemo {
    public static int[] exchange(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
        return arr;
    }
    public static void showArrays(int[] arr){
        for (int x:arr){
            System.out.print(x+" ");
        }System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{17, 29};
        showArrays(arr);
        exchange(arr);
        showArrays(arr);
    }
}
