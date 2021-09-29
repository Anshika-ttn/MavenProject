import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class eight {
    public static void main(String[] args){
        DateFormat dateformat = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date =  new Date();
        System.out.println("The current date in --> 21 March 2016 <-- this format is :\n" + dateformat.format(date));
    }
}
