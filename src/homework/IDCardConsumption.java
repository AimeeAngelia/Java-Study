package homework;

public class IDCardConsumption {
    static int count = 0;
    double[] arr = new double[]{1550.0, 1920.0, 1979.0, 2259.0, 1835.0, 1799.0, 2688.0};
    public void showPrint(double[] arr){
        for (double x:arr){
            System.out.println("您有一笔大额交易,交易金额:"+x);
            count++;
        }
    }

    public static void main(String[] args) {
        IDCardConsumption showPrintName = new IDCardConsumption();
        showPrintName.showPrint(showPrintName.arr);
        System.out.print("您最近有"+count+"笔交易.");

    }
}
