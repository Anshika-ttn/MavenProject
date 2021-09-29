import java.lang.*;
class sample extends Thread{
    public void run(){
        System.out.println("Thread is running....");
        for(int i=0; i<5; i++) {
        try{Thread.sleep(1000);}
        catch(Exception e){System.out.println(e);}
        System.out.println("Iterating : " + i);
        }}}
public class second {
    public static void main(String[] args){
        sample s1 = new sample();
        sample s2 = new sample();
        sample s3 = new sample();
        s1.start();
        try{
            s1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        s2.start();
        s3.start();
    }
}
