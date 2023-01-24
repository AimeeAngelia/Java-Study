package Chapter7;
//import java.lang.Object;
class Telephone{
    String button = "button:0~9";
    void call(){
        System.out.println("开始拨打电话.");
    }
}
class Mobile extends Telephone{
    String screen = "screen:4K";
}
public class Demo2 {
    public static void main(String[] args) {
        Mobile motto = new Mobile();
        System.out.println(motto.button);
        System.out.println(motto.screen);
        motto.call();
    }
}
