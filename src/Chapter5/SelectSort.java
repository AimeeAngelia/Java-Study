package Chapter5;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{63, 4, 24, 1, 3, 15};
        SelectSort sorter = new SelectSort();
        sorter.sort(arr);
    }
    public void sort(int[] arr){
        int index;
        for (int i=1; i<arr.length;i++){
            index=0;
            for (int j=1; j<=arr.length-i; j++){
                if (arr[j]>arr[index]){//由小到大
//              if (arr[j]<arr[index]){//由大到小
                    index=j;
                }
            }
            int temp = arr[arr.length-i];
            arr[arr.length-i] = arr[index];
            arr[index] = temp;
        }
        showArrays(arr);
    }
    public void showArrays(int[] arr){
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
