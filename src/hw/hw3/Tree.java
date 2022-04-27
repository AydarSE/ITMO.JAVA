package hw.hw3;

public class Tree {
    private int age;
    private boolean alive;
    private String name;


    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        String live = "живое дерево";
        if (alive == false) {
            live = "неживое дерево";
        }
        return "возраст: " + age + "; " + live + "; название: " + name;
    }
}
