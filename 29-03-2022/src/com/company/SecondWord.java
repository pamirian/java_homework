package com.company;

/*
-дошли до первого пробела- начали накапливать строку
-до следующего пробела или до конца строки
*/
public class SecondWord {
    public static void main(String[] args) {
        System.out.println(strHor("Пример строки"));
    }
    public static String strHor(String str) {
        String result = "";
        int spaceCounter = 0;
        for (int i = 0; i < str.length(); i++) {
           char currentSymbol = str.charAt(i);
           if(currentSymbol==' '){
               spaceCounter = spaceCounter + 1;
               if (spaceCounter == 2) {
                   return result;
               }
           }
           else if (spaceCounter > 0) {
               result = result + currentSymbol;
           }
        }
        return result;
    }
}

/*
public class SecondWord2 {
        public static void main(String[] args) {
        System.out.println(strHor("дошли до первого пробела"));
            }
        public static String strHor(String str) {
        String result = "";
        int i=0;
        while (str.charAt(i)!=' '){
            i++;
        }
        for (int j = i+1; j < str.length() && str.charAt(j)!=' '; j++) {
            result=result+str.charAt(j);
        }
        return result;
    }
}
*/
