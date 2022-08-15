package homework_03.task_03;

public class Main {

    public static void main(String[] args) {

        Plane plane = new Plane();
        plane.conclusion();

        Ship ship = new Ship();
        ship.conclusion();

        Car car = new Car();
        car.conclusion();

        ship.setNewFieldAll("Новый кораблик",20000,30,2022,40,"Шанхая");
        ship.conclusion();
    }
}
