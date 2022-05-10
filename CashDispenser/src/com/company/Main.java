package com.company;

/* Написатъ диспенсер для банкомата. Он выдает деньги, у него есть некоторое количество кассет, в которые загружаются
    купюры разного номинала. при запросе въдаются разные купюры, но они могут и заканчиваться.
   Подсказка: можно осоздать массив или переменные с номиналами и их количеством;
    пользователь задает сумму, а банкомат выдает купюры соответно запросу.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] moneyNominals = {100, 50, 20, 10};
        int[] moneyQuantity = {20, 20, 20, 20};
        boolean isFalse = false;
        System.out.println("Терминал выдает купюры номиналов 100, 50, 20, 10\nВведите сумму кратную 10: ");
        while (!isFalse) {
            int getMoney = console.nextInt();

            int totalMoneyInDispenser = 0;
            for (int i = 0; i < moneyNominals.length; ) {
                for (int j = 0; j < moneyQuantity.length; j++) {
                    int allNominals = moneyNominals[i] * moneyQuantity[j];
                    totalMoneyInDispenser = totalMoneyInDispenser + allNominals;
                    i++;
                }
            }

            if (getMoney > totalMoneyInDispenser) {
                System.out.println("В банкомате недостаточно денег");
                // return;
            } else {

                if (getMoney % 10 != 0) {
                    System.out.println("Вы ввели некорректную сумму");
                } else {

                    for (int i = getMoney; i > 0; ) {
                        for (int j = 0; j < moneyNominals.length; ) {
                            if (getMoney >= moneyNominals[j] && moneyQuantity[j] > 0) {
                                getMoney = getMoney - moneyNominals[j];
                                i = getMoney;
                                moneyQuantity[j]--;
                                totalMoneyInDispenser = totalMoneyInDispenser - moneyNominals[j];

                                System.out.println("Выдана банкнота: " + moneyNominals[j]);
                                if (totalMoneyInDispenser <= 0) {
                                    System.out.println("Денег больше нет, но вы держитесь...");
                                    isFalse = true;
                                }
                            } else j++;
                        }
                    }
                }
            }
        }
    }
}






