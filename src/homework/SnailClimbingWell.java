package homework;

public class SnailClimbingWell {
    public static void main(String[] args) {
        int days = 1;
//        int well = 10;
        for (int well=8;well>0;well-=2){
            days+=1;
            well+=1;
        }System.out.println(days);
    }
}