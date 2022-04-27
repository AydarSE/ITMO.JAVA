package hw.hw3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class House {
    private int floorsN;
    private int buildingY;
    private String name;


    public void setHouse(int number, int year, String name) {
        floorsN = number;
        buildingY = year;
        this.name = name;
    }

    public String getHouse() {
        return "Количество этажей:" + floorsN + ", Год постройки:" + buildingY + ", Наименование:" + name;
    }

    public int years() {
        Calendar calendar=new GregorianCalendar();
        return calendar.get(Calendar.YEAR)-buildingY;
    }

    public void getHouseInfo (){
        System.out.println(getHouse());
    }

    public void yearInfo (){
        System.out.println(years());
    }

}
