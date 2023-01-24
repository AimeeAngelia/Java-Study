package homework;

public class CandyApple {
    double money;
    public void money(double m){
        money = m/500*4.98;
    }
    public String toString(){
        return "需要支付"+money+"元.";
    }

    public static void main(String[] args) {
        CandyApple user1 = new CandyApple();
        user1.money(2500);
        System.out.println(user1);
    }
}
