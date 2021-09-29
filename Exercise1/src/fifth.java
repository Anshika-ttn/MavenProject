public class fifth {
    public static void main(String[] args) {
        String[] str1 = {"apple", "banana", "kiwi", "mango", "orange"};
        String[] str2 = {"peach", "banana", "papaya", "pomegranate", "orange"};
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i].equals(str2[j])) {
                    System.out.println("the common elements are: " + str1[i]);
                }
            }
        }
    }
}
