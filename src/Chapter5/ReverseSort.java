package Chapter5;

public class ReverseSort {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50,60,70};
        ReverseSort sorter = new ReverseSort();
        sorter.sort(arr);
    }
    public void sort(int[] arr){
        System.out.print("RAW: ");
        showArrays(arr);
        int tmp;
        for (int i=0; i<arr.length/2; i++){
            tmp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=tmp;
        }
        System.out.print("NEW: ");
        showArrays(arr);
    }
    public void showArrays(int[] arr){
        for (int x:arr){
            System.out.print(x+" ");
        }System.out.println();
    }
}
