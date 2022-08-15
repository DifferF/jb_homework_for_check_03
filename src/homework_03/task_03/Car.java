package homework_03.task_03;

public class Car extends Vehicle{

    Car (){
        name = "Subaru Forester TOURING";
        price = 18000;
        speed = 240;
        year = 2018;
    }

    @Override // аннотация переопределения
    public void conclusion() {
        System.out.println(titleName + name + titlePrice + price + titleSpeed + speed + titleYear + year + titleSeparator);
    }
}
