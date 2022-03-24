package com.company;
/*
Given two integers number1 and number2. Implement method that returns the sum of all numbers between number1 and number2 that divisible by 3.
Example: getSumDivisibleByTreeNumbers(20,10) -> 45
 */
public class Main5 {
    public static void main(String[] args) {

        System.out.println(getSumDivisibleByTreeNumbers(10, 20));
    }

    public static int getSumDivisibleByTreeNumbers(int a, int b) {
        int min = (a >= b) ? b : a;
        int max = (a >= b) ? a : b;
        int summ = 0;

        while (min <= max) {
            if (min % 3 == 0) {
                summ = summ+min;
            }
            min = min + 1;
        }
        return summ;
    }
}
