package com.company;

public class Point {
    private int coordX;
    private int coordY;
    private int colorR;
    private int colorG;
    private int colorB;
    //Конструктор без параметров, по умолчанию ставит точку черного цвета в начале координат
    public Point(){
        this.coordX = 0;
        this.coordY = 0;
        this.colorR = 0;
        this.colorG = 0;
        this.colorB = 0;
    }

    //Конструктор с параметрами
    public Point(int coordX, int coordY, int colorR, int colorG, int colorB) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.colorR = colorR;
        this.colorG = colorG;
        this.colorB = colorB;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public void setColorR(int colorR) {
        if(colorR<0){
            System.err.println("Ошибка! R-компонент цвета ниже допустимого диапазона");
            this.colorR = 0;
            } else
        if(colorR>255){
            System.err.println("Ошибка! R-компонент цвета выше допустимого диапазона");
            this.colorR = 255;
            }
        else {
            this.colorR = colorR;
        }
    }

    public void setColorG(int colorG) {
        if(colorG<0){
            System.err.println("Ошибка! G-компонент цвета ниже допустимого диапазона");
            this.colorG = 0;
            } else
        if(colorG>255){
            System.err.println("Ошибка! G-компонент цвета выше допустимого диапазона");
            this.colorG = 255;
            }
        else {
            this.colorG = colorG;
        }
    }

    public void setColorB(int colorB) {
        if(colorB<0){
            System.err.println("Ошибка! B-компонент цвета ниже допустимого диапазона");
            this.colorB = 0;
            } else
        if(colorB>255){
            System.err.println("Ошибка! B-компонент цвета выше допустимого диапазона");
            this.colorB = 255;
            }
        else {
            this.colorB = colorB;
        }
    }

    public void printPoint(){
        System.out.println("Координаты точки: [x="+coordX + ", y=" +coordY + "], цвет: ("+colorR+","+colorG+","+colorB+")");
    }
}