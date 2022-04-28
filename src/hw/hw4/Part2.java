package hw.hw4;

import java.util.Arrays;
import java.util.Scanner;


public class Part2 {

    public static int[] inArray() {
        System.out.println("Введите длину массива:");
        Scanner scanner = new Scanner(System.in);
        int length1 = scanner.nextInt();
        int[] array = new int[length1];
        System.out.println("введите элементы массива: ");
        for (int i = 0; i < length1; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //1.проверяет отсортирован ли массив по возрастанию
    public static void task1() {
        System.out.println("---------task1---------");
        int[] array1 = inArray();
        int length2 = array1.length;
        for (int i = 0; i < length2 - 1; i++) {
            if (array1[i] > array1[i + 1]) {
                System.out.println("Please, try again");
                return;
            }
        }
        System.out.println("Ok");
    }

    //2.считывает и выводит
    public static void task2() {
        System.out.println("--------task2------------");
        int[] array2 = inArray();
        System.out.println("Result:" + Arrays.toString(array2));
    }

    //3.меняет местами первый и последний элемент массива
    public static void task3() {
        System.out.println("--------task3------------");
        int[] array3 = inArray();
        int length3 = array3.length;
        System.out.println("Array1:" + Arrays.toString(array3));
        int element = array3[0];
        array3[0] = array3[length3 - 1];
        array3[length3 - 1] = element;
        System.out.println("Array2:" + Arrays.toString(array3));
    }

    //4.Найдите первое уникальное в этом массиве число
    public static void task4() {
        System.out.println("------------task4---------");
        int[] array4 = inArray();
        System.out.println("Array:" + Arrays.toString(array4));
        for (int i : array4) {
            int unique = 0;
            for (int j : array4) {
                if (i == j) {
                    unique++;
                }
            }
            if (unique == 1) {
                System.out.println("Первое уникальное число:" + i);
                return;
            }
        }
        System.out.println("Уникальных чисел нет");
        return;
    }


}

