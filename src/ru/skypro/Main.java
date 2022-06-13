package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int m = 0;
        while (m < 10) {
            m++;
            System.out.print(m + " ");
        }

        System.out.println();
        for (int n = 10; n > 0; n--) {
            System.out.print(n + " ");
        }

        // Задание 2

        System.out.println();
        for (int friday = 1; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        // Задание 3

        for (int l = 0; l <= 2122; l = l + 79) {
            if (l >= 1822 && l <= 2122) {
                System.out.println(l);
            }
        }
    }
}
