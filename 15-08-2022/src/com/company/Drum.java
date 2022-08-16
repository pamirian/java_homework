package com.company;

public class Drum implements Instrument{
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет инструмент барабан размера "+this.size);
    }
}
