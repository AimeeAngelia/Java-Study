package Chapter6;

public class StaticDemo {
    static double PI = 3.14159265357;

    public static void method(){
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
//        System.out.println(StaticDemo.PI);
        System.out.println(PI);
//        StaticDemo.method();
        method();
    }
}
