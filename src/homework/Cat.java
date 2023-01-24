package homework;

public class Cat {
//    String color;
    public Cat(String color){
//        this.color=color;
        System.out.println(color+"去抓老鼠.");
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("黑猫");
        Cat c2 = new Cat("白猫");
        Cat c3 = new Cat("黄猫");
    }

}
