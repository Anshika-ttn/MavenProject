interface Override{
    default void over() {
        System.out.println("Using Default");
    }
}
public class seven {
    public static void main(String[] args) {
        Override override = new Override() {
            @java.lang.Override
            public void over() {
                System.out.println("Overriding Default");
            }
        };
        override.over();
    }
}
