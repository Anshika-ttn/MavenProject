@FunctionalInterface
interface Only{
    String add (String a);
}
public class one {
    public static void main(String[] args) {
        Only only = (a) -> a.toUpperCase();
        System.out.println(only.add("anshika@ttnjain"));

    }
}

