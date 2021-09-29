import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class first {
    public static void main(String[] args){
        List<Float> floatinglist = new ArrayList<>();
        floatinglist.add(1.5f);
        floatinglist.add(2.2f);
        floatinglist.add(3.7f);
        floatinglist.add(4.8f);
        floatinglist.add(5.9f);
        floatinglist.add(55.6f);
        System.out.println(floatinglist);
        float sum = 0;
        Iterator<Float> it = floatinglist.iterator();
         while ( it.hasNext()){
             float val = it.next();
             sum = sum +val;
         }
        System.out.println(sum);
    }

}
