package com.company;

/*
1. Создайте классы «Собака» и «Кот» с наследованием от класса «Животное».
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передаётся длина препятствия. Результатом выполнения действия будет печать в консоль.
Например, dogBobik.run(150); -> 'Бобик пробежал 150 м'.
3. У каждого животного есть ограничения на действия:
- бег: кот — 200 м, собака — 500 м;
- плавание: кот не умеет плавать, собака — 10 м.
*/

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Буцефал");
        animal1.run(1150);
        animal1.swim(1100);

        System.out.println("-------------");

        Dog animal2 = new Dog("Шарик");
        animal2.run(-10);
        animal2.swim(1600);

        System.out.println("-------------");

        Cat animal3 = new Cat("Барсик");
        animal3.run(100);
        animal3.swim(0);

        System.out.println("-------------");

        Animal animal4 = new Cat("Симба");
        animal4.run(130);
        animal4.swim(10);

    }
}
