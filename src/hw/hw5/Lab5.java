package hw.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab5 {

    //1.метод для поиска самой длинного слова
    public static String task1(String string) {
        System.out.println("---------task1-----------");
        String[] sentence = string.split(" ");
        String l = new String();
        int maxLength = 0;
        for (String s1 : sentence) {
            if (s1.length() > maxLength) {
                l = s1;
                maxLength = s1.length();
            }
        }
        System.out.println("Самое длинное слово в этом тексте: " + l);
        return l;
    }

    //2.проверяет является ли слово палиндромом
    public static boolean task2(String string) {
        System.out.println("---------task2-----------");
        String stringToLow = string.toLowerCase();
        return (stringToLow.equals(new StringBuilder(stringToLow).reverse().toString()));
    }

    //3.метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]
    public static String task3(String string) {
        System.out.println("---------task3-----------");
        String stringLow = string.toLowerCase();
        return (stringLow.replaceAll("бяка", "[вырезано цензурой]"));
    }

    //4.Найти количество вхождений одной (являющейся подстрокой) в другую
    public static int task4(String string, String subString) {
        System.out.println("---------task4-----------");
        Pattern p = Pattern.compile(subString);
        Matcher m = p.matcher(string);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }

    //5.Напишите метод, который инвертирует слова в строке
    public static void task5(String string) {
        System.out.println("---------task5-----------");
        System.out.println("Строка: " + string);
        String[] string1 = string.split(" ");
        StringBuilder string2 = new StringBuilder();
        for (String word : string1) {
            string2.append(new StringBuilder(word).reverse())
                    .append(" ");
        }
        System.out.println("Преобразовано: " + string2);
    }

}
