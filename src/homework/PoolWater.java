package homework;

public class PoolWater {
    static int volumeOfPool = 0;
    public static void pourOut(){
        volumeOfPool=volumeOfPool-2;
    }
    public static void waterInjection(){
        volumeOfPool=volumeOfPool+3;
    }
    public static void time(int s){
        int t=0;
        while (t<s){
            t++;
            waterInjection();
            pourOut();
            System.out.println("现在是相对时间第"+t+"s,此时水池水量为"+volumeOfPool+"L.");
        }
    }
    public static void main(String[] args) {
    time(100);
    }
}
