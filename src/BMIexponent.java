public class BMIexponent {
    public static void main(String[] args) {
        double height = 1.72;
        int weight = 70;
        double exponent = weight/(height*height);
        System.out.println("Your height is "+height);
        System.out.println("Your weight is "+weight);
        System.out.println("Your BMI is "+exponent);
        System.out.print("you is ");
        if (exponent<18.5){
            System.out.println("so light");
        }
        if (exponent>=18.5&&exponent<24.9){
            System.out.println("good");
        }
        if (exponent>=24.9&&exponent<29.9){
            System.out.println("a little obesity");
        }
        if (exponent>=29.9){
            System.out.println("very obesity");
        }
    }
}
