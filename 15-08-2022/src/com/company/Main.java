package com.company;
/*
1. Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
2. Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
3. Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
4. Создать массив типа Инструмент, содержащий инструменты разного типа.
5. В цикле вызвать метод play() для каждого инструмента, который должен выводить строку
    "Играет такой-то инструмент, с такими-то характеристиками".
 */
public class Main {

    public static void main(String[] args) {

        Instrument instrument1 = new Guitar(12);
        Drum instrument2 = new Drum(20); //тут я специально создал барабан типа Drum а не типа Instrument, чтобы
        // показать, что так тоже работает, так как класс Drum имплементирует интерфейс Instrument
        Instrument instrument3 = new Trumpet(15);

        Instrument[] instruments = {instrument1, instrument2, instrument3};

        for (Instrument i: instruments) {
            i.play();
        }
    }
}
