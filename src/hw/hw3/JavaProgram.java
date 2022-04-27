package hw.hw3;

public class JavaProgram {
    public static void main(String[] args) {

        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        System.out.println("===============3.2=================");
        Auto auto1 = new Auto("Белый", "Nissan", 1200);
        Auto auto2 = new Auto("Красный", "BMW", 1400);
        System.out.println(auto1);
        System.out.println(auto2);

        System.out.println("===============3.3=================");
        House house1=new House();
        House house2=new House();
        house1.setHouse(3,2008,"London");
        house2.setHouse(7,2012,"New York");
        house1.getHouseInfo();
        house2.getHouseInfo();
        house1.yearInfo();
        house2.yearInfo();

        System.out.println("===============3.4=================");
        Tree tree1=new Tree();
        Tree tree2=new Tree(18,"Сосна");
        Tree tree3=new Tree(30,true,"Кедр");

        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);

    }

}
