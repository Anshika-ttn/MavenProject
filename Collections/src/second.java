import java.util.Set;
import java.util.TreeSet;

public class second {
    public static void main(String args[]){
        String str="anshika.jain.ttn@5190";
        Set<String> ts = new TreeSet<>();

        for (int i = 0; i < str.length(); i++) {
            ts.add(String.valueOf(str.charAt(i)));
        }
        System.out.println("Unique characters: " + ts);
        System.out.println("Number of Unique Characters: " + ts.size());

    }
}