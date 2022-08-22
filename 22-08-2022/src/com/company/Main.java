package com.company;

import java.util.ArrayList;

/*
Даны два ArrayList, представляющих два неотрицательных целых числа. Цифры, составляющие эти числа, хранятся
 по отдельности в ArrayList. Например,
ArrayList<Integer> a = new ArrayList<>();
a.add(2);
a.add(4);
a.add(3);
представляет трехзначное число 243.
Написать программу, которая складывает два числа, заданных подобным образом и получает
ответ в виде нового ArrayList.
 */

public class Main {

    public static void main(String[] args) {
        //первый ArrayList
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(9);
        number1.add(9);
        number1.add(9);
        System.out.println(number1);
        //второй ArrayList
        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(1);
        number2.add(1);
        number2.add(1);
        System.out.println(number2);

        // вытаскиваем числа из арейлистов и переводим их в строки чтобы получить трехзначные числа
        String s="",s2="";
        for (int i=0; i < number1.size()&& i< number2.size(); i++) {
            s=s+number1.get(i);
            s2=s2+number2.get(i);
        }
        //складываем трехзначные числа, предварительно преобразуя строки в числа
        Integer s3=Integer.parseInt(s)+Integer.parseInt(s2);

        System.out.println("--------");
        // создаем третий ArrayList
        ArrayList<Integer> number3 = new ArrayList<>();
        // проверяем, если в результате сложения получилось чытерехзначное число то добавляем в арейлист 4 числа
        if (s3.toString().length()>3){
            number3.add(s3/1000);
            number3.add((s3%1000)/100);
            number3.add((s3/100)%10);
            number3.add(s3%10);
        } else {
            // если трехзначное число, то добавляем 3 числа
            number3.add(s3/100);
            number3.add((s3%100)/10);
            number3.add(s3%10);
        }
        // выводим в консоль
        System.out.println(number3);
    }
}
