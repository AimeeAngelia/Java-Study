package homework;

public class BubbleSortStudentScore {
    public static void main(String[] args) {
        int[] score = new int[]{71, 89, 67, 53, 78, 64,  92, 56, 74, 85};
        BubbleSortStudentScore sorter = new BubbleSortStudentScore();
        sorter.sort(score);
    }
    public void sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for (int j=0; j<arr.length-i; j++){
                if (arr[j]<arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }showArrays(arr);
    }
    public void showArrays(int[] arr){
        for (int x: arr){
            System.out.print(x+" ");
        }
    }
}
