public class Calculation {
    public static void main(String[] args) {
        int boys = 15;
        int girls = 17;
        int total = boys + girls;
        boolean result1 = ((boys>girls)&&(total>30));
        boolean result2 = ((boys>girls)||(total>30));
        System.out.println(result1);
        System.out.println(result2);
//        int b = 34 < 56 ? 1 : 2;
//        System.out.println(b);
    }
}
