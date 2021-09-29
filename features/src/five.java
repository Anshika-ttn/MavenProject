import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class five {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anshika", "Tina", "Rajesh", "Rahul", "Virat", "Pulkit");

        Consumer<String> consumer = a -> System.out.println(a);
        System.out.println("Output using consumer:- ");
        list.forEach(consumer);

        Supplier<String> supplier = () -> list.toString();
        System.out.println("Output using supplier :- " +supplier.get());

        Predicate<String> predicate = String -> {if(list.contains("Anshika")) return true; else return false;};
        System.out.println("Output using predicate :- " +predicate.test("anshika"));

        Function<String , Integer> function = s -> s.length();
        System.out.println("Output using function :- " +function.apply("Anshikattnjain"));

    }
}
