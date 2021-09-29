public class sixth {
   public static void main(String[] agrs){
           int num[] = {3, 5, 1, 3, 4, 4, 1, 5, 2};
           int result = num[0];
           for (int i = 1; i < num.length; i++){
               result ^= num[i];
           }
           System.out.println("The number that appears once in the array: " + result);
       }
}
