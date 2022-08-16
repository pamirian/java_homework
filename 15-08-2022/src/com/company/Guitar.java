package com.company;

public class Guitar implements Instrument{
    private int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("Играет инструмент гитара, с соличеством струн "+this.strings+" в "+KEY);
    }
}
