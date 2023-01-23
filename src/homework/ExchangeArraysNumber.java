package homework;

public class ExchangeArraysNumber {
    static  int[] arr = new int[]{1, 3, 5, 7, 9, 4, 2, 6};
    public static  int[] exchange(int[] numberToExchange){
        for (int i=0; i<numberToExchange.length/2; i++){
            int tmp = numberToExchange[i];
            numberToExchange[i] = numberToExchange[numberToExchange.length/2+i];
            numberToExchange[numberToExchange.length/2+i] = tmp;
        }
        return numberToExchange;
    }
    public static void showArrays(int[] needToShowNumber){
        for (int x:needToShowNumber){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int[] endToNumber = exchange(arr);
        showArrays(endToNumber);
    }
}
