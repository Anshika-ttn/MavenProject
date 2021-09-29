import java.lang.*;
class start extends Thread{
    int sum = 0;
    @Override
    public void run(){
        synchronized (this){
            System.out.println("child thread start calculation");
            for(int i=0;i<=5;i++){
                sum += i;
                this.notifyAll();
            }
        }
    }
}
public class fourteen {
    public static void main(String[] args) throws InterruptedException{
        start s = new start();
        s.start();
        System.out.println("Thread starts here");
        synchronized (s) {
                s.wait( 500);

            System.out.println("Hello  " + s.sum);
        }
    }
}
