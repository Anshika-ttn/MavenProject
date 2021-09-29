import java.util.*;
public class seven
{
    public static void convert(int s)
    {
        int d = s / (24 * 3600);

        s = s % (24 * 3600);
        int h = s / 3600;

        s %= 3600;
        int m = s / 60 ;

        s %= 60;
        int sec = s;

        System.out.println( d + " " + "days " + h + " " + "hours " + m + " " + "minutes " + sec + " " + "seconds ");
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seconds\n");
        int s = sc.nextInt();
        convert(s);
    }
}