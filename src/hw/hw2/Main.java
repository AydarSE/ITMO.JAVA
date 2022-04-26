package hw.hw2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание1");

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2, 6));
        System.out.println(calculator.division(10.0,2.0));
        System.out.println(calculator.multiplication(3888, 30999));
        System.out.println(calculator.subtraction(1.324, 3.455));


        System.out.println("Задание2");

        Car car = new Car("Red", 260);
        String color = car.getColor();
        car.setSpeed(200);
        Integer speed = car.getSpeed();


        System.out.println(car);
        System.out.println(color);
        System.out.println(speed);


    }
}
