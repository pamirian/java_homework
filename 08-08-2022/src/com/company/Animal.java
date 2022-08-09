package com.company;

public class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + "м");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + "м");
    }
}
