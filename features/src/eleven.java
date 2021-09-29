import java.util.Arrays;
import java.util.List;

public class eleven{
    public static void main(String[]args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Average of the number inside integer list after doubling it is : "+ list.stream()
                .mapToInt(e -> e * 2)
                .average().getAsDouble());


    }
}

