public class ten {
    int add(int num1, int num2)
    {
        return num1+num2;
    }
    double add(double num1, double num2)
    {
        return num1+num2;
    }
    float mul(float p, float q){
        return p * q;
    }
    int mul(int num1, int num2){
        return num1 * num2;
    }
    String cat(String str1, String str2){
        return str1 + str2;
    }
    String cat(String str1, String str2, String str3){
        return str1 + str2 + str3;
    }
    public static void main(String[] args)
    {
        ten obj = new ten();
        System.out.println("Sum of two integers: "+obj.add(10, 20));
        System.out.println("Sum of two doubles: "+obj.add(10.1, 20.2));
        System.out.println("Multiplication of two floating point numbers: " + obj.mul(1.5f, 2.6f));
        System.out.println("Multiplication of two integers: " + obj.mul(3, 2));
        System.out.println("Concatenation of two strings: " + obj.cat("Hello ","Joe"));
        System.out.println("Concatenation of three strings: " + obj.cat("Hello ","Mr." , "Jack"));
    }
}
