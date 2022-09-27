/*
Second level: Написать функциональный интерфейс с методом, который принимает число и возвращает булево значение.
Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает true если переданное число
делится без остатка на 13.
 */
public class Main2 {

    public static void main(String[] args) {
        double number = 13;
//        Dividable dividable = new Dividable() {
//            @Override
//            public boolean divide(double num) {
//                return (num%13==0);
//            }
//        };

        Dividable dividable = a -> {
            return a%number==0;
        };

        System.out.println(dividable.divide(39));

    }
    @FunctionalInterface
    public interface Dividable{
        public boolean divide (double num);

    }
}
