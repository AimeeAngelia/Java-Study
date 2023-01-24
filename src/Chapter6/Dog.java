package Chapter6;

public class Dog {
    String name;
    String color;
    String voice;

    public Dog(String name, String color, String voice) {
        this.name=name;
        this.color=color;
        this.voice=voice;
    }
    public void call(){
        System.out.println(voice);
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("毛毛","白色","汪汪汪");
        System.out.print(d1.name+"颜色是"+d1.color);
        System.out.print(",叫起来的声音是:");
        d1.call();
        Dog d2 = new Dog("灰灰","灰色","嗷呜~");
        System.out.print(d2.name+"颜色是"+d2.color);
        System.out.print(",叫起来的声音是:");
        d2.call();
    }
}
