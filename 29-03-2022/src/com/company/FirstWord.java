package com.company;
/*
Implement the method that takes String and print the first word of the String
(all chars before the first space)
(“Пример строки”) ->”Пример”
 */
public class FirstWord {
    public static void main(String[] args) {
        strHor("Пример строки");
        //System.out.println();
        //strHor2("Пример строки");
    }
    public static void strHor(String str) {
      for (int i=0; (i < str.length())&&(str.charAt(i)!=' '); i++){
            System.out.print(str.charAt(i));

            }
        System.out.print(3&1);
        }

        /* public static void strHor2(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                System.out.print(str.charAt(i));
            } else {
                break;
            }
        }
        System.out.println();
        System.out.println("Работа завершена");
    }
   */
}

