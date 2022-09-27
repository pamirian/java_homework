/*
First level: Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
 */
public class Main {
    public static void main(String[] args) {
        Printable printable = () -> System.out.printf("Print");
        printable.print();
    }

    public interface Printable {
        void print();
    }

}