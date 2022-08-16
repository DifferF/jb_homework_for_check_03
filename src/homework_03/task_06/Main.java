package homework_03.task_06;

public class Main {

    public static void main(String[] args) {
        String inputText = "Printer";

        Printer printing = new Printer(); // дефолт
        printing.print(inputText);
        // Приведение к базовому типу
        Printer printingBlack = new Black();
        printingBlack.print(inputText);
        Printer printingRed = new Red();
        printingRed.print(inputText);
        Printer printingGreen = new Green();
        printingGreen.print(inputText);
        Printer printingYellow = new Yellow();
        printingYellow.print(inputText);
        Printer printingBlue = new Blue();
        printingBlue.print(inputText);
        Printer printingPurple = new Purple();
        printingPurple.print(inputText);
        Printer printingCyan = new Cyan();
        printingCyan.print(inputText);
        Printer printingGrey = new Grey();
        printingGrey.print(inputText);

        // UpCast
        Printer printingCyan2 = printingCyan;
        printingCyan2.print(inputText);
        Printer printingPurple2 = printingPurple;
        printingPurple2.print(inputText);
        // DownCast
        Yellow printingCyan3 = (Yellow) printingCyan;
        printingCyan3.print(inputText);
        Yellow printingPurple3 = (Yellow) printingPurple;
        printingPurple3.print(inputText);
    }
}

