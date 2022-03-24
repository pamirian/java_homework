package com.company;
/*
Given two integers number1 and number2. Implement method that printы all numbers between number1 and number2 that divisible by 3.
Example: printDivisibleByTree(10,20) ->
12
15
18
 */
public class Main4 {
    public static void main(String[] args) {

        printDivisibleByTree(10,20);
    }
    public static void printDivisibleByTree(int a,int b){
        int min= (a>=b)?b:a;
        int max= (a>=b)?a:b;

        while (min<=max){
            if (min%3==0) {
                System.out.println(min);
            }
            min = min + 1;
        }
    }
}