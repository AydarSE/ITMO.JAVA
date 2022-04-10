package hw.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) throws IOException {

       System.out.println("Задание1");
       System.out.println("Я");
       System.out.println("хорошо");
       System.out.println("знаю");
       System.out.println("Java");

       System.out.println("Задание2");
       int a=46;
       int b=10;
       double c=3.0;
       int d=29;
       int e=4;
       int f=-15;

       double x=(a+b)*(b/c);
       System.out.println(x);

       int y=(d*e*f);
       System.out.println(y);

       System.out.println("Задание3");
       int number=10500;
       double result1=(number/10d/10);
       System.out.println(result1);

       System.out.println("Задание4");
       double n1=3.6;
       double n2=4.1;
       double n3=5.9;
       double result2=(n1*n2*n3);
       System.out.println(result2);

       System.out.println("Задание5");
       Scanner scanner=new Scanner(System.in);
       System.out.println("Введите 1е целое число");
       int number1= scanner.nextInt();
       System.out.println("Введите 2е целое число");
       int number2= scanner.nextInt();
       System.out.println("Введите 3е целое число");
       int number3= scanner.nextInt();
       System.out.println("Вы ввели следующие целые числа:");
       System.out.println(number1);
       System.out.println(number2);
       System.out.println(number3);

       System.out.println("Задание5: Второй способ");
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       //String string= reader.readLine();
       System.out.println("Введите 1е целое число");
       int number4=Integer.parseInt(reader.readLine());
       System.out.println("Введите 1е целое число");
       int number5=Integer.parseInt(reader.readLine());
       System.out.println("Введите 1е целое число");
       int number6=Integer.parseInt(reader.readLine());
       System.out.println("Вы ввели следующие целые числа:");
       System.out.println(number4);
       System.out.println(number5);
       System.out.println(number6);


       System.out.println("Задание6");
       System.out.println("Введите целое число:");
       int b2= scanner.nextInt();
       if (b2%2!=0) {
          System.out.println("Нечетное");
       } else if (b2<100) {
          System.out.println("Нечетное");
       } else {
          System.out.println("Выход за пределы диапазона");
       }
}

}
