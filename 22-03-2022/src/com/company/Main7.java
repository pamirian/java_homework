package com.company;
/*
5 *Implement method that prints that prints multiply table
1 2 3 4 ……… 9 10
2 4 6 8 ……… 18 20
3 6 9 12 …… .27 30
………………………………
10 20 30 …… 90 100
 */

public class Main7 {
    public static void main(String[] args) {
        multiplyTable(10,10);
    }
    public static void multiplyTable(int a, int b) {
        int i=1;
        while (i<=a){
            int j=1;
            while (j<=b) {
                System.out.print(j*i+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}