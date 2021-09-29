interface InterfaceOne {
    default void play(){
        System.out.println("I'm playing football");
    }
}
interface InterfaceTwo {
    default void play(){
        System.out.println("I'm playing cricket");
    }
}
class MyClass implements InterfaceOne, InterfaceTwo {
    public void play() {
        System.out.println("I'm playing Chess!");
    }
}
public class eight{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.play();
    }
}