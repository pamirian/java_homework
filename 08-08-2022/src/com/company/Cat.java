package com.company;

public class Cat extends Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void run(int distance) {
        if (distance < 0) {
            distance = 0;
        } else if (distance > 200) {
            distance = 200;
        }
        System.out.println(name + " пробежал " + distance + "м");

    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }
}
