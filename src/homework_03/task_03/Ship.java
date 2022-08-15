package homework_03.task_03;


// Для класса Ship – количество пассажиров и порт приписки.

public class Ship extends Plane {

    private String homePort; // порт приписки
    private final String titleHomePort = "\nПорт приписки: ";

    public Ship (){
        this. name = "Титаник";
        this.price = 7500000;
        this.speed = 23.00; // в узлах или 42 кмч
        this.year = 1912;
        this.passengers = 1317;
        this.homePort = "Ливерпуль";
    }

    @Override // аннотация переопределения
    public void conclusion() {
        System.out.println(titleName + name + titlePrice + price + titleSpeed + speed + titleYear + year + titleHomePort + homePort + titlePassengers + passengers + titleSeparator);
    }

    public void setNewFieldAll(String name,int price, int speed, int year, int passengers, String homePort){
        this.name = name;
        this.price = price;
        this.speed = speed; // в узлах или 42 кмч
        this.year = year;
        this.passengers = passengers;
        this.homePort = homePort;
    }

}
