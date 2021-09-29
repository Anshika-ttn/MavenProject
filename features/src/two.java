@FunctionalInterface
interface Tri{
    int method(int a, int b);
}

public class two {
    public static void main(String[] args) {
        Tri tri = (a, b) ->  b;
        System.out.println(tri.method(5,6));
    }
}
