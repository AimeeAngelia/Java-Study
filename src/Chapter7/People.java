package Chapter7;

public class People {
    int id;
    String name;
    public People(int id, String name){
        this.id=id;
        this.name=name;
    }
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
           return false;
        if (getClass()!=obj.getClass())
            return false;
        People other = (People) obj;
        if (id !=other.id)
            return false;
        return true;
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        People p1 = new People(220, "tom");
        People p2 = new People(220, "汤姆");
        People p3 = new People(330, "张三");
        Object o = new Object();

        System.out.println(p1+"与"+p2+"是不是同一个人?");
        System.out.println("equals()结果"+p1.equals(p2));
        System.out.println("==运算符的结果"+(p1==p2));

        System.out.println();
        System.out.print(p1+"与"+p3+"是不是同一个人?");
        System.out.println(p1.equals(p3));
        System.out.print(p1+"与"+o+"是否为同一人?");
        System.out.println(p1.equals(o));
    }
}
