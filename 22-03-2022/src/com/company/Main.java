
package com.company;

import java.util.Scanner;
/* Задача, которую не доделали во время урока и оставили в качестве домашнего задания:
вывод только четных чисел в введеном диапозоне
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();

        printNumbers(a,b);
    }

    public static void printNumbers(int a,int b){
        int min= (a>=b)?b:a;
        int max= (a>=b)?a:b;

        while (min<=max){
            if (max%2!=0) {
                max = max - 1;
            }
            System.out.print(max + " ");
            max = max - 2;

        }


    }


}