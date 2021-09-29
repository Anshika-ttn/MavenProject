import java.util.Timer;
import java.util.TimerTask;

public class eight {
    public static void main(String[] args){
        Timer time = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                for(int i=0;i<=10;i++){
                    System.out.println("Task timer on fixed rate");
                }
            }
        };
        time.scheduleAtFixedRate(tt,500,1000);
      //  time.scheduleAtFixedRate(tt,500,1000);
      //  time.schedule(tt,500,1000);
    }
}
