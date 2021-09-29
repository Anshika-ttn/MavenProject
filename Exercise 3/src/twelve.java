import org.w3c.dom.css.Counter;
import java.util.concurrent.atomic.AtomicInteger;

public class twelve {
    static class Counter{
        private AtomicInteger c = new AtomicInteger(0);
        public void increment(){
            c.getAndIncrement();
        }
        public int value(){
            return c.get();
        }
    }
    public static void main(final String[] args) throws InterruptedException{
        final Counter count = new Counter();
        for(int i=0;i<1000 ; i++){
            new Thread((new Runnable() {
                @Override
                public void run() {
                    count.increment();
                }
            })).start();
            Thread.sleep(1000);
            System.out.println("Final number should be " + count);
        }

    }
}
