package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point();
        point1.printPoint();

        System.out.println("-----");

        Point point2 = new Point();
        point2.setCoordX(1);
        point2.setCoordY(1);
        point2.setColorR(-1);
        point2.setColorG(290);
        point2.setColorB(1);

        point2.printPoint();

        System.out.println("-----");

        // не понимаю, как сделать так чтобы point3 с неправильными цветами выдавал ошибку
        // почеиу-то сеттеры не меняют значения из конструктора
        Point point3 = new Point(1,1,-2,-2,-2);
        point3.printPoint();

        System.out.println("-----");

        // ввод параметров с консоли, но тут тоже сеттеры не меняют значения из конструктора если ввести цвета из неправильного диапазона
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты точки в формате:[X,Y,R,G,B], где:\nX-координаты точки по оси X\nY-координаты точки по оси Y\nR-первый компанент цвета точки\nG-второй компанент цвета точки\nB-третий компанент цвета точки\n>>");
            int coordX = sc.nextInt();
            int coordY = sc.nextInt();
            int colorR = sc.nextInt();
            int colorG = sc.nextInt();
            int colorB = sc.nextInt();

            Point point0 = new Point(coordX, coordY, colorR, colorG, colorB);
            point0.printPoint();

    }
}
