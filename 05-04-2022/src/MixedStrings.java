/*
Implement the method that takes two Strings and return the String that contain chars from the first
string mixed through one with chars from other String
 */
public class MixedStrings {
    public static void main(String[] args) {
        System.out.println(mixedStrings("abcd", "qwer"));
        System.out.println(mixedStrings("ab", "qwer"));
        System.out.println(mixedStrings("abcd", "qw"));
    }

    public static String mixedStrings(String str1, String str2) {
        String result = "";
            if (str1.length() == str2.length()) {
                for (int i = 0; i < (str1.length()); i++) {
                result = result + str1.charAt(i) + str2.charAt(i);
            }
            } else if (str1.length() > str2.length()){
                for (int i = 0; i < (str2.length()); i++) {
                    result = result + str1.charAt(i) + str2.charAt(i);
                }

            }else if (str2.length() > str1.length()){
                for (int i = 0; i < (str1.length()); i++) {
                    result = result + str1.charAt(i) + str2.charAt(i);
                }
            }
                return result;
    }
}

