import java.util.*;
public class eight {
    public static void main(String[] args){
        Scanner done = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = done.nextLine();
        do
        {
            if(word.charAt(0) == word.charAt(word.length() - 1))
            {
                System.out.println("First and last character are equals for the word: " + word);
            }
            else
            {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = done.nextLine();
        }while(!word.equals("done"));
    }
}
