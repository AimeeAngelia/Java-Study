package homework;

public class Cell {
    public static void main(String[] args) {
        int cellNumber = 1;
        for (int x = 1;x<10;x++){
           cellNumber = cellNumber<<1;
        }
        System.out.println(cellNumber);
    }
}
