package com.company;
/*
Write a method that takes a String and a two chars. As the result it returns the given String, where each the
first char was replaced by the second char. You have to use only length() and charAt() methods of String class.
 */
public class aStringAndATwoChars {
    public static void main(String[] args) {
       strObr("more expresso - less depresso ", 'x', 's');
    }
    public static void strObr(String str, char a, char b) {
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == a) {
                System.out.print(b);
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}