import java.util.*;
    class third{
        static void characterCount(String inputString)
        {
            Map<Character, Integer> count = new HashMap<Character, Integer>();
            char[] str = inputString.toCharArray();
            for (char c : str) {
                if (count.containsKey(c)) {
                    count.put(c, count.get(c) + 1);
                }
                else {
                    count.put(c, 1);
                }
            }
            for (Map.Entry entry : count.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        public static void main(String[] args)
        {
            String str = "anshika";
            characterCount(str);
        }
}
