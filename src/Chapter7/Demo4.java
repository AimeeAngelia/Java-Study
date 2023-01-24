package Chapter7;

class Bird{}
class Pigeon extends Bird{}
public class Demo4 {
    public static void main(String[] args) {
        Bird bird = new Pigeon();
        Pigeon pigeon = (Pigeon)bird;
    }
}
