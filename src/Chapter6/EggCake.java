package Chapter6;

public class EggCake {
    int eggCount;
    public EggCake(int eggCount){
        this.eggCount = eggCount;
    }
    public EggCake(){
        this(1);
    }

    public static void main(String[] args) {
        EggCake cake1 = new EggCake();
        System.out.println(cake1.eggCount);
        EggCake cake2 = new EggCake(2);
        System.out.println(cake2.eggCount);
    }
}
