package com.company;

/*
Дано, массив и число. Написать метод, который  возвращает новый массив,
в который добавлено это число, причем так, что все числа исходного массива,
которые меньше его, находятся левее, те которые больше или равны - правее.
При этом порядок элементов не важен!
 */

public class NewArrayWithEnteredNumber {

    public static void main(String[] args) {
        int[] array = {4, 3, 8, 9, 6};
        int number = 7;

        System.out.println(number);
        getArray(array);
        getArray(getNewArrayWithEnteredNumber(array, number));

    }

    public static int[] getNewArrayWithEnteredNumber(int[] array, int number) {
        int[] newArray = new int[array.length + 1];
        int counterLeft = 0;
        int counterRight = newArray.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < number) {
                newArray[counterLeft] = array[i];
                counterLeft++;
            } else if (array[i] > number) {
                newArray[counterRight] = array[i];
                counterRight--;
            }
            newArray[counterLeft] = number;
        }
        return newArray;
    }
    public static void getArray (int[] array){
        System.out.print("{ ");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("}");
    }
}
