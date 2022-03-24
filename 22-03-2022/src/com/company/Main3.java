package com.company;
/*
Implement method “countdown” that prints numbers from 5 to 1, than prints „start“
countdown() -> 5
4
3
2
1
Start
 */
public class Main3 {
    public static void main(String[] args) {

        countdown(5);
    }
    public static void countdown (int number) {
        while (number>0){
            System.out.println(number);
            number--;
        }
        System.out.println("Start");
    }
}