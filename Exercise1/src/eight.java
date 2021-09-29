
import java.lang.*;
import java.io.*;
import java.util.*;

public class eight {
    public static void main(String[] args)
    {
        String str = "AnshikaJain";
        StringBuffer strbuff = new StringBuffer(str);
        strbuff.reverse();
        System.out.println("The Reversed string is : " + strbuff);
        strbuff.delete(4, 9);
        System.out.println("After deleting reversed string from index 4 to 9 : " + strbuff);
    }
}
