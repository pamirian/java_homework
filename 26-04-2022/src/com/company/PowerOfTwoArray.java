package com.company;
/*
Implement a method that returns new array of int. Every element of the array is next power of two.
The length of the array is given n (the max value of n is 30. Why do you think?)
powerOfTwo (5) -> {1,2,4,8,16}
 */
public class PowerOfTwoArray {
    public static void main(String[] args) {
        int number = 5;
        System.out.print(number+" -> ");
        getArray(makePowerOfTwoArray(number));
        //the max value of n is 31 because Maximum value of integer type is 2 to the power of 31 - 1.
    }
    public static int[] makePowerOfTwoArray(int number){
        int[] arr = new int[number];
        for (int i = 1; i < arr.length; i++) {
             arr[0] = 1;
             arr[i] = arr[i-1]*2;
        }
        return arr;
    }
    public static void getArray (int[] array){
        System.out.print("{ ");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("}");
    }
}
