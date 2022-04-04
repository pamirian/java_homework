package com.company;
/*
Implement the method that takes String and print the first word of the String
(all chars before the first space)
(“Пример строки”) ->”Пример”
 */
public class FirstWord {
    public static void main(String[] args) {
        strHor("Пример строки");
    }
    public static void strHor(String str) {
      for (int i=0; str.charAt(i)!=' '; i++){
            System.out.print(str.charAt(i));
            }
    }
}