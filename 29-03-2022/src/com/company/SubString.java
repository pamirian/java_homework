package com.company;
/*
Implement the method that takes String, int startIndex, int endIndex.
The method returns the substring of the given String between startIndex and endIndex
(startIndex inclusive endIndex exclusive).
You have to use only length() and charAt() methods of String class.
substring(“It is my own method”,9,12) ->”own”
 */
public class SubString {
    public static void main(String[] args) {
        subString("It is my own method",9,12);
    }
    public static void subString(String str, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++){
            System.out.print(str.charAt(i));
        }
    }
}