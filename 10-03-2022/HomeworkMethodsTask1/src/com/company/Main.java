package com.company;

import java.util.Scanner;

public class Main {

// Task1. Implement the method that takes three numbers and returns minimum of they. Example: getMinimum(5,6,1) ->1

    public static void main(String[] args) {
        String equal = "not detected. Numbers are equal";
        System.out.println("Enter numbers: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println("Min is: "+minOfNumbers(number1, number2, number3, equal));
    }
    public static int minOfNumbers(int number1, int number2, int number3, String equal){

        if ((number1<number2)&&(number1<number3)) {return number1;}
        else if ((number2<number1)&&(number2<number3)) {return number2;}
        else if ((number3<number1)&&(number3<number1)) {return number3;}
        return 0;
    }
}