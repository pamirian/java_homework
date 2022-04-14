/*
Implement the method that counts how many words in the given String.
The words are separate by space. You have to use only length() and charAt() methods of String class.
 */
public class HowManyWords {
    public static void main(String[] args) {
        howManyWords("It’s new task for me");
    }
    public static void howManyWords(String str) {
        int gaps = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                gaps = gaps + 1;
            }
        }
        System.out.println(str + " -> " + (gaps + 1));
    }
}
