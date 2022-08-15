package homework_03.task_04;

/*
Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker. Переопределите соответствующий метод.
При вызове данного метода необходимо выводить на экран "Документ сохранен в новом формате".
 */

public class ExpertDocumentWorker extends ProDocumentWorker{

    @Override
    public void saveDocument(){
        System.out.println("Документ сохранен в новом формате");
    }

}
