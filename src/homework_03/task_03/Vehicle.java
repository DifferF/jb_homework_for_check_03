package homework_03.task_03;

        /*
        Задание 3+
        Используя IntelliJ IDEA, создайте проект.
        Требуется: Создать класс Vehicle.
        В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год выпуска).
        Создайте 3 производных класса Plane, Саг и Ship.

        Для класса Plane должна быть определена высота и количество пассажиров.
        Для класса Ship – количество пассажиров и порт приписки.

        Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
         */

public class Vehicle {

    protected int price;
    protected double speed;
    protected int year;

    protected String name;
    protected final String titleName = "Название: ";
    protected final String titlePrice = "\nСтоимость: ";
    protected final String titleSpeed = "\nСкорость: ";
    protected final String titleYear = "\nГод выпуска: ";
    protected final String titleSeparator = "\n____________________";

    protected Vehicle(){
    }

    protected Vehicle(String name,int price, double speed, int year){
            this.name = name;
            this.price = price;
            this.speed = speed;
            this.year = year;
    }

    public void conclusion() {
    }

}
