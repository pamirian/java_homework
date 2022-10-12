import java.util.*;

//Определить количество четных чисел в потоке данных.
public class Solution {
    public static void main(String[] args) {
        int[] array = {1,2,12,45,23,22,45,67,18,123,678,23,24,26};
        int result= (int) Arrays.stream(array)
                .filter(o -> o % 2 == 0)
                .count();
        System.out.println(result);

//Задано множество фамилий сотрудников. Разработать программу, которая отображает все фамилии,
// начинающиеся на букву «J».

        Set<String> set = new HashSet<>();
        set.add("Johnson");
        set.add("Adams");
        set.add("Jackson");
        set.add("Mask");
        set.add("Gates");
        set.stream().filter(s -> s.startsWith("J")).forEach(System.out::println);

// Пусть дана коллекция состоящая из строк. Arrays.asList(«Highload», «High», «Load», «Highload»).
// а) Вывести, сколько раз объект «High» встречается в коллекции.

        List<String> high = Arrays.asList("Highload", "High", "Load", "Highload");
        System.out.println(high.stream().filter(o -> o.contains("High")).count());

// б) Какой элемент в коллекции находится на первом месте? Если мы получили пустую коллекцию,
// то пусть возвращается 0.

        System.out.println(high.stream().findFirst().orElse(String.valueOf(0)));

//Дана коллекция Arrays.asList("f10", "f15", "f2", "f4", "f4"). Нужно выполнить сортировку
// в обратном алфавитному порядке и удалить дубликаты. В массиве должны оказаться только уникальные значения

        List<String> elements = Arrays.asList("f20", "f10", "f15", "f2", "f4", "f4");
        elements.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}