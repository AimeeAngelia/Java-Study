public class Val {
    static int times = 3;
    public static void main(String[] args) {
        int times = 4;//局部变量先于成员变量
        System.out.println(times);
    }
}
