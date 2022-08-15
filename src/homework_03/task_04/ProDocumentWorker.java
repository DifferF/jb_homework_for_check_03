package homework_03.task_04;

/*
Создайте производный класс ProDocumentWorker. Переопределите соответствующие методы, при переопределении методов выводите следующие строки:
"Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт".
 */

public class ProDocumentWorker  extends DocumentWorker{

    // Приведение к базовому типу используется для сокрытия реализации членов производного класса.
    private final String testString = "TEST";
    public void testString(){
        System.out.println(testString);
    }

    @Override
    public void editDocument(){
        System.out.println("Документ отредактирован");
    }
    @Override
    public void saveDocument(){
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }

}
