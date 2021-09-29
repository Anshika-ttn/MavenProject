import java.lang.*;
class test implements Runnable{
    public void run(){
        System.out.println("Thread is running....");
        for(int i=0;i<5;i++){
            System.out.println("My name is Anshika.");
        }
    }
}
public class first {
    public static void main(String[] args){
        test t = new test();
        Thread thread = new Thread(t);
        System.out.println("Thread starts here");
        thread.start();
    }
}
