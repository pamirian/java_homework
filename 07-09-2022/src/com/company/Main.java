package com.company;
/*
Солдаты всегда строились, строятся и будут строиться по убыванию роста. Отсортируй солдат, предварительно подумав,
что лучше использовать при таких условиях - Comparable или Comparator.
Реализовать класс Soldier. Можно с одним полем - рост. Создать коллекцию солдат и отсортировать ее.
Что Вы используете - Comparable или Comparator - выбирать Вам, но нужно объяснить свой выбор.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

// В данном случае достаточно использовать интерфейс Comparable,
// так как, у нас всего одно поле по которому мы будем сортировать
        List<Soldier> soldiers = new ArrayList<>();

        soldiers.add(new Soldier(189));
        soldiers.add(new Soldier(180));
        soldiers.add(new Soldier(175));
        soldiers.add(new Soldier(178));
        soldiers.add(new Soldier(176));
        soldiers.add(new Soldier(181));
        soldiers.add(new Soldier(172));
        soldiers.add(new Soldier(170));
        soldiers.add(new Soldier(184));

        System.out.println(soldiers);
        Collections.sort(soldiers);
        System.out.println(soldiers);
    }
}
