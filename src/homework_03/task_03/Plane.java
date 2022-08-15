package homework_03.task_03;


// Для класса Plane должна быть определена высота и количество пассажиров.
public class Plane extends Vehicle {

    private int height;        // высота 11 900
    protected int passengers;  // 150

    private final String titleHeight = "\nМаксимальная высота: ";
    protected final String titlePassengers = "\nКоличество пассажиров: ";

    public Plane() {
        super("Airbus A319", 90000000, 871.00, 1995);
        this.height = 11900;
        this.passengers = 150;
    }

    @Override // аннотация переопределения
    public void conclusion() {
        System.out.println(titleName + name + titlePrice + price + titleSpeed + speed + titleYear + year + titleHeight + height + titlePassengers + passengers + titleSeparator);
    }
}
