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
        for (int i = 0; i < number; i++) {
            arr[i] = i * 2;
            System.out.print(arr[i]+"="+i+" ");
            System.out.print("Coming soon..");
        }
    }

}
