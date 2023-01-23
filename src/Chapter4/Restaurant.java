package Chapter4;

public class Restaurant {
    public static void main(String[] args) {
        int count = 9;
        System.out.println("Four persons.");
        if (count<=4){
            System.out.println("4");
        } else if (count>4&&count<=8) {
            System.out.println("8");
        } else if (count>8&&count<=16) {
            System.out.println("Box");
        }else {
            System.out.println("Sorry!");
        }
    }
}
