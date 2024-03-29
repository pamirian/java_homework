package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// кейс 1: Когда значения цветов заданы вне диапазона, то выводится ошибка и они сеттерами приводятся к границам диапазона
        Point point2 = new Point();

        point2.setCoordX(1.0);
        point2.setCoordY(1.3);
        point2.setColorR(-1);
        point2.setColorG(290);
        point2.setColorB(1);

        System.out.println(point2);

        System.out.println("-----");

// кейс 2: Когда цвета и координаты не заданы, конструктором по умолчанию ставит точку черного цвета в начале координат
        Point point1 = new Point();
        System.out.println(point1);

        System.out.println("-----");

// кейс 3: Если ошибочные параметры цветов введены при создании объекта,
//// то они меняются на корректные в кострукторе, путем вызова в нем сеттеров.
        Point point3 = new Point(1,1,-2,280,1000);
        System.out.println(point3);
        //point3.printPoint();

        System.out.println("-----");

// кейс 4: Ввод параметров с консоли. Если ошибочные параметры цветов введены при создании объекта,
// то они меняются на корректные в кострукторе, путем вызова в нем сеттеров.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты точки в формате:[X,Y,R,G,B], где:\nX-координаты точки по оси X\nY-координаты точки по оси Y\nR-первый компанент цвета точки\nG-второй компанент цвета точки\nB-третий компанент цвета точки\n>>");
        int coordX = sc.nextInt();
        int coordY = sc.nextInt();
        int colorR = sc.nextInt();
        int colorG = sc.nextInt();
        int colorB = sc.nextInt();

        Point point0 = new Point(coordX, coordY, colorR, colorG, colorB);
        System.out.println(point0);

    }
}