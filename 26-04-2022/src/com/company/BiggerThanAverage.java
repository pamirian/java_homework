package com.company;
/*
Implement a method that prints all elements of the given array that bigger than average value of array elements
{2, 6, 5, 3} -> 6 5
 */
public class BiggerThanAverage {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 3};
        System.out.print("{2, 6, 5, 3} -> ");
        getBiggerThanAverage(arr);
    }
   public static void getBiggerThanAverage(int[] arr){
       int sum = 0;
       for (int i = 0; i < arr.length; i++) {
           sum = sum + arr[i];
       }
       for (int i = 0; i < arr.length ; i++) {
       if(arr[i] > (sum/arr.length)) {
           System.out.print(arr[i] + " ");
       }
       }
   }
}
