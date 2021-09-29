public class fourth {
    public static void main(String[] args){
        String str = "HeLL0!!  MYname!s@nshik@1999J@in<>";
        int upper = 0, lower = 0, number = 0, special = 0;
        int total = str.length();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }
        System.out.println("Total length of the string is: " + total);
        System.out.println("Lower case letters : " + (lower*100)/str.length() + "%");
        System.out.println("Upper case letters : " + (upper*100)/str.length() + "%");
        System.out.println("Number : " + (number*100)/str.length() + "%");
        System.out.println("Special characters : " + (special*100)/str.length() + "%");
    }
}
