package com.company;

public class Dog extends Animal {
    private String name;
    private int distance;

    public Dog(String name) {
        this.name = name;
    }

    public void run(int distance) {
        if (distance < 0) {
            distance = 0;
        } else if (distance > 500) {
            distance = 500;
        }
        System.out.println(name + " пробежал " + distance + "м");
    }

    public void swim(int distance) {
        if (distance < 0) {
            distance = 0;
        } else if (distance > 10) {
            distance = 10;
        }
        System.out.println(name + " проплыл " + distance + "м");
    }
}
