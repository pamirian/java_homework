package com.company;

public class Trumpet implements Instrument{
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
            System.out.println("Играет инструмент труба с диаметром "+this.diameter+" не в "+KEY); //добавил контсанту
            // сюда, чтобы она без дела не осталась

        }
}
