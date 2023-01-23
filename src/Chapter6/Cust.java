package Chapter6;

public class Cust {
    static int count = 0;
    String name;
    public Cust(String name){
        this.name = name;
        count++;
        System.out.print(count+" ");
    }
    public static void showPrint(String Name){
        System.out.println(Name);
    }

    public static void main(String[] args) {
        Cust c1 = new Cust("Tom");
        showPrint(c1.name);
        Cust c2 = new Cust("张三");
        showPrint(c2.name);
        Cust c3 = new Cust("egg");
        showPrint(c3.name);

    }
}
