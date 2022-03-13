package com.company;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            System.out.println("Enter numbers: ");
            Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();
            System.out.println("Min is: "+minOfNumbers(number1, number2, number3));
        }
        public static int minOfNumbers(int number1, int number2, int number3){
            if ((number1<number2)&&(number1<number3)) {return number1;}
            else if ((number2<number1)&&(number2<number3)) {return number2;}
            else return number3;
        }
    }


