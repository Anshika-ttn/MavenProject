public class third {
    public static void main(String[] args){
        String input = "aaabbAAAAAcccd";
        char search = 'd';
        long count = input.chars().filter(ch -> ch == search).count();
        System.out.println("The Character '"+search+"' appears "+count+" times.");
    }
}
