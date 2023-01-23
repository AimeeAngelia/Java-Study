package homework;

public class IdCard {
    int password;
    public IdCard(int password){
        this.password = password;
    }
    public IdCard(){
        this(123456);
    }

    public static void main(String[] args) {
        IdCard user1 = new IdCard(842593);
        System.out.println(user1.password);
        IdCard user2 = new IdCard();
        System.out.println(user2.password);
    }
}
