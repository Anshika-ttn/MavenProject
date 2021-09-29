import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class tryLockClass implements Runnable {
    String nn;
    ReentrantLock relc;

    public tryLockClass(ReentrantLock rl, String n) {
        relc = rl;
        nn = n;
    }

    public void run() {
        boolean dn = false;
        while (!dn) {
            try {
                int c = 0;
                if (relc.tryLock()) {
                    int i;
                    Thread t1 = new Thread();
                    for (i = 5; i <= 10; i++)
                        System.out.println(t1.getName());
                        t1.checkAccess();
                        t1.countStackFrames();
                        c = c + 1;
                        if (i > 7) {
                            System.out.println(t1.getName());
                            break;
                        }
                    }
                }
                finally{
                    System.out.println("task name - " + nn + "releasing lock(outer lock");
                    relc.unlock();
                    System.out.println("Lock Hold Count - " + relc.getHoldCount());
                }
            }
        }
    }

public class sixteen {
    static final int MAX_TIME = 2;
    public static void main(String[] args){
        ReentrantLock rel = new ReentrantLock();
        ExecutorService pool = Executors.newFixedThreadPool(MAX_TIME);
        Runnable r = new tryLockClass(rel,"Job1");
        pool.execute(r);
        pool.shutdown();
    }
}
