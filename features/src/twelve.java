import java.util.Arrays;
import java.util.List;

public class twelve {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("First even number which is greater than 3 in the integer list : " +
                list.stream().filter(e -> e % 2 == 0).filter(e -> e > 3).findFirst().get());

    }
}