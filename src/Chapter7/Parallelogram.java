package Chapter7;

class Quadrangle{

}
public class Parallelogram extends Quadrangle {
    int edges = 4;

    public static void main(String[] args) {
        Quadrangle p = new Parallelogram();
        /* p.edges = 6;      //向上转型,父类对象无法调用子类独有的属性或方法 */
    }
}


