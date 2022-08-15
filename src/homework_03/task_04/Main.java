package homework_03.task_04;


        /*
        В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
        Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается экземпляр базового класса),
        если пользователь ввел номера ключа доступа pro и exp,
        то должен создаться экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.
        создать экземпляр версии класса приведенный к базовому
         */
            /*
            Приведение к базовому типу используется для сокрытия реализации
            членов производного класса.
            BaseClass instance = new DerivedClass();
             */

public class Main {

    public static void main(String[] args) {

        System.out.println("Версия default доступна без key \nВерсия pro: key_pro \nВерсия exp: key_exp ");
        System.out.print("Введите KEY |");
        java.util.Scanner input = new java.util.Scanner(System.in);
        String inputKey = input.nextLine();

        switch (inputKey) {
            case "":
                DocumentWorker def = new DocumentWorker();
                def.openDocument();
                def.editDocument();
                def.saveDocument();
                break;
            case "key_pro":
                DocumentWorker    pro = new ProDocumentWorker();
                // Приведение к базовому типу используется для сокрытия реализации членов производного класса.
                // ProDocumentWorker pro = new ProDocumentWorker();
                // pro.testString();
                pro.openDocument();
                pro.editDocument();
                pro.saveDocument();
                break;
            case "key_exp":
                DocumentWorker    exp = new ExpertDocumentWorker();
                exp.openDocument();
                exp.editDocument();
                exp.saveDocument();
                break;

        }
    }
}
