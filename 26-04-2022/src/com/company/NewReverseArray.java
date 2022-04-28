package com.company;
/*
Implement a method that returns the new array that is the given array in reverse order
{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}
 */
public class NewReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 3, 5, -9};
        System.out.println("{10, 3, 3, 5, -9} -> " + getNewReverseArray(arr));
    }
public static int[] getNewReverseArray(int[] arr){
    for (int i = 0; i < arr.length ; i++) {
        arr[i]=arr[i];
    }
return arr;
    }

}
