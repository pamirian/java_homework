package com.company;
/*
5 *Implement method that prints that prints multiply table
1 2 3 4 ……… 9 10
2 4 6 8 ……… 18 20
3 6 9 12 …… .27 30
………………………………
10 20 30 …… 90 100

Задача решена без использования операции умножения
 */

public class Main6 {
    public static void main(String[] args) {
        multiplyTable(10,10);
    }
    public static void multiplyTable(int a, int b) {
      int i=1;
        while (i<=a){
            int j=1;
                while (j<=b) {

              switch (i){
                case 2: j++; b=20;      break;
                case 3: j=j+2; b=30;    break;
                case 4: j=j+3; b=40;    break;
                case 5: j=j+4; b=50;    break;
                case 6: j=j+5; b=60;    break;
                case 7: j=j+6; b=70;    break;
                case 8: j=j+7; b=80;    break;
                case 9: j=j+8; b=90;    break;
                case 10: j=j+9; b=100;  break;
                 }
                 System.out.print(((j>0 && j<10)?" ":"")+j+"\t");
              j++;
             }
                System.out.println();
                i++;
    }
  }
}