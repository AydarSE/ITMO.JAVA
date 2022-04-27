package hw.hw2;

public class Car {
    private String color;
    private Integer speed;

    //конструктор по умолчанию
    public Car() {
    }

    // конструктор с параметрами
    public Car(String color, Integer speed) {
        this.color = color;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Цвет:" + color + ", Скорость:" + speed;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
