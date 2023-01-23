package Chapter5;

public class Tautog {
    public static void main(String[] args) {
        int arr[][]=new int[][]{{4,3},{1,2}};
        int i = 0;
        for (int x[]:arr) {
            i++;
            int j = 0;
            for (int e : x){
                j++;
                if (i == arr.length && j == x.length){
                    System.out.print(e);
                }else {
                    System.out.print(e+",");
                }
            }
        }
    }
}
