package com.company;

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