package Chapter4;

public class ContinueTest {
    public static void main(String[] args) {
        for (int i = 1; i<=20; i++){
            if (i%2==0){
                continue;
//                break;
            }System.out.println(i);
        }
    }
}
