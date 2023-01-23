package homework;

public class KfcCoca {
    int numberOfIce;
    public KfcCoca(int numberOfIce){
        this.numberOfIce =numberOfIce;
    }
    public KfcCoca(){
        this(0);
    }

    public static void main(String[] args) {
        KfcCoca ice1 = new KfcCoca();
        System.out.println(ice1.numberOfIce);
        KfcCoca ice2 = new KfcCoca(3);
        System.out.println(ice2.numberOfIce);
    }
}
