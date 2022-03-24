package com.company;
/*
Implement a method that prints the given String N times.
printLineNtimes(“hello”,3) -> hello
hello
hello
 */
public class Main2 {
    public static void main(String[] args) {

        printLineNtimes("hello",3);
    }
    public static void printLineNtimes (String str, int number) {
        int toPrint=0;
        while (toPrint < number){
            System.out.println(str);
            toPrint++;
        }
    }
}