import java.lang.*;
class fun extends Thread{
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
            notify();
        }
    }

}
public class thirteen {
    public static void main(String[] args){
        fun f = new fun();
        f.start();
        System.out.println("Thread starts here");

        synchronized(f){
            try{
                System.out.println("Waiting for fun to complete...");
                f.wait(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("Total is: " + f.total);
        }
    }
}

