package Chapter6;

public class People {
    String name;
    int age;
    String sex;
    public People(){
    }
    public People(String name, int age, String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
        System.out.println(name+" "+age+" "+sex+".");
    }
    public static void main(String[] args) {
        People p1 = new People("tom",23,"man");
        People p2 = new People("lily",19,"woman");
    }
}
