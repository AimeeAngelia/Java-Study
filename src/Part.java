public class Part {
    static final double PI = 3.14;
    static int age = 23;
    public static void main(String[] args) {
        final int number;
        number = 1235;
        age = 24;
        //java: 可能已分配变量number
//        number = 1236;
        System.out.println(PI);
        System.out.println(number);
        System.out.println(age);

    }
}
