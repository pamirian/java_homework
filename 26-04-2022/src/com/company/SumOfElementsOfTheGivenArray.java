package com.company;
/*
Implement a method that returns the sum of elements of the given array of int
{10, 3, 23, 5, -9} -> 32
 */
public class SumOfElementsOfTheGivenArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 23, 5, -9};
        System.out.println("{10, 3, 23, 5, -9} -> " + getSumOfElementsOfTheGivenArray(arr));

    }
    public static int getSumOfElementsOfTheGivenArray (int[] arr){
    int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
    return sum;
    }
}
