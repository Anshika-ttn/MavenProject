@FunctionalInterface
interface MyInterface {
    void calculate(int a, int b);
}
class MethodReference{
    static void mul(int a, int b){
        System.out.println("Multiplication = " + (a*b));
    }
    void sum(int x, int y){
        System.out.println("Addition = " + (x+y));
    }
    void sub(int p, int q){
        System.out.println("Subtraction = " + (p-q));
    }
}
public class three {
    public static void main(String[] args) {
       MyInterface myinterface = MethodReference::mul;
       myinterface.calculate(5,6);

        MyInterface myinterface1 = new MethodReference()::sum;
        myinterface1.calculate(5,6);

        MyInterface myinterface2 = new MethodReference()::sub;
        myinterface2.calculate(10,5);
    }
}
