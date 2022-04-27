package hw.hw3;

public class Auto {
    private String color;
    private String brand;
    private Integer weight;

    public Auto() {
    }

    public Auto(String color) {
        this.color = color;
    }

    public Auto(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public Auto(String color, String brand, Integer weight) {
        this.color = color;
        this.brand = brand;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Цвет:" + color + ", Марка:" + brand + ", Вес:" + weight;
    }

}

