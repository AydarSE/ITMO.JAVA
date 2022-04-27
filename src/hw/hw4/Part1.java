package hw.hw4;

import java.util.Scanner;

public class Part1 {

    //выводит на консоль нечетные числа от 1 до 99.
    public static void task1() {
        System.out.println("---task1---Вывести на консоль нечетные числа от 1 до 99");
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое )
    public static void task2() {
        System.out.println("-----------task2-------------");
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и на 5:" + i);
            } else if (i % 3 == 0) {
                System.out.println("Делится на 3:" + i);
            } else if (i % 5 == 0) {
                System.out.println("Делится на 5:" + i);
            }
        }
    }

    public static boolean task3() {
        System.out.println("--------task3-----------вернуть true, если сумма равна третьему целому числу");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int number3 = scanner.nextInt();
        if (number1 + number2 == number3) {
            System.out.println("true");
        } else
            System.out.println("false");
        return false;
    }

    public static boolean task4() {
        System.out.println("--------task4-----------возвращает true, если num2>num1, а num3>num2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int num3 = scanner.nextInt();
        if (num1 < num2 && num3 > num2) {
            System.out.println("true");
        } else
            System.out.println("false");
        return false;
    }

    //5.проверить, появляется ли число 3 как первый или последний элемент массива целых чисел
    public static boolean task5(int[] array1) {
        System.out.println("-----task5----проверить, появляется ли число 3 как первый или последний элемент");
        if (array1[0] == 3 || array1[array1.length - 1] == 3) {
            System.out.println("true");
        } else
            System.out.println("false");

        return false;
    }

    //6.проверить, что массив содержит число 1 или 3
    public static void task6(int[] array1) {
        System.out.println("-----task6----проверить, что массив содержит число 1 или 3");
        for (int number : array1) {
            if (number == 1 || number == 3) {
                System.out.println("Массив содержит 1 или 3");
            } else
                System.out.println("Массив не содержит 1 или 3");
        }
    }

}


