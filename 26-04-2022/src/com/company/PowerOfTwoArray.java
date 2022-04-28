package com.company;
/*
Implement a method that returns new array of int. Every element of the array is next power of two.
The length of the array is given n (the max value of n is 30. Why do you think?)
powerOfTwo (5) -> {1,2,4,8,16}
 */
public class PowerOfTwoArray {
    public static void main(String[] args) {
        getPowerOfTwoArray(5);
    }
    public static void getPowerOfTwoArray(int number){
       int[] arr = new int[number];
        arr[0] = 1;
        for (int i = 1; i < number; i++) {
            arr[i] = arr[i-1] * 2;
            System.out.println(arr[0]+" "+arr[i]);
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("["+i+"]="+ arr[i]+"  ");
        }
        System.out.println();
    }

}
