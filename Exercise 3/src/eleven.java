import java.util.ArrayList;
import java.util.List;

class Circle{
    String name = "";
    public int count = 0;
    public void geekName(String geek, List<String> list){
        synchronized (this){
            name = geek;
            count++;
        }
        list.add(geek);
    }
}
public class eleven {
    public static void main(String[] args){
        Circle c = new Circle();
        List<String> list = new ArrayList<String>();
        c.geekName("anshi", list);
        System.out.println(c.name);
    }
}
