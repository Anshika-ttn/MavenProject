import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;

public class five {
    public static void main(final String[] args) throws InterruptedException {
        ThreadPoolExecutor exe = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        exe.submit(new Task());
        exe.submit(new Task());
        exe.shutdown();
        System.out.println("get task count after ; " + exe.getTaskCount());
        System.out.println("Is Executor is terminated" + exe.isTerminated());
    }
    static class Task implements Runnable {
        @Override
        public void run() {
            try {
                Long duration = (long) (Math.random() + 5);
                System.out.println("Running thread name" + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(duration);
                System.out.println("Complete thread name" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
            }
        }
    }
}
