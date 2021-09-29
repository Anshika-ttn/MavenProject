@FunctionalInterface
interface Test{
    default void hello() {
        System.out.println("hello");
    }
    static void bye(){
        System.out.println("Bye");
    }
    void add();
}
public class six{
    public static void main(String[] args) {
        Test test = () -> System.out.println("hi");
        test.add();
        Test.bye();
        test.hello();
    }
}