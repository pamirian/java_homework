package com.company;
/*
Implement the program that read Integers from Scanner
and prints the sum of all integers were input. The program will finish when 0 input.
 */

import java.util.Scanner;

public class SummOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number>0)
        {
            sum = sum + number;
            number = scanner.nextInt();
        }
            System.out.println(sum);
        }
 }


