package homework;

public class MathPow {
    static double end;
    public void pow(double raw){
        end = raw*raw*raw*raw;
        System.out.println(raw+"的4次幂是"+end);
    }

    public static void main(String[] args) {
        MathPow p1 = new MathPow();
        p1.pow(45.6);
        p1.pow(0.35);
    }
}
