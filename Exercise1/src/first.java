import java.util.*;
public class first {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Parent String
        System.out.println("Enter the string:-\n");
        String str = input.nextLine();

        //String to be replaced
        System.out.println("Enter the string that you want to replace:-\n");
        String old_str = input.nextLine();

        //String to be replaced with
        System.out.println("Enter the new string that you want to enter:-\n");
        String new_str = input.nextLine();

        //Final String
        String replaced = str.replace(old_str, new_str);
        System.out.println("Enter the replaced string:-\n " + replaced);


    }

}
