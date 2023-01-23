package homework;


public class CarGas {
//    int[] arr = new int[]{6, 2};
//    static  int gas = 6;
//    static  int v = 2;
//    static  int t = 0;
    public void gas(int gasNow, int total){
        int t = 0;
        while (gasNow<+total){
            gasNow+=2;
            t+=5;
            System.out.println(gasNow+"L "+t+"s...");
        }
//        this.t = t;
//        return gasNow;
    }

    public static void main(String[] args) {
    CarGas gas = new CarGas();
    gas.gas(6,30);

    }
}
