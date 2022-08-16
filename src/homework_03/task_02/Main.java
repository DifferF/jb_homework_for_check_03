package homework_03.task_02;

public class Main {
    public static void main(String[] args) {


        ClassRoom[] student = new ClassRoom[4];
        student [0] = new ClassRoom(new ExcelentPupil());
        student [1] = new ClassRoom(new GoodPupil());
        student [2] = new ClassRoom(new BadPupil());
        student [3] = new ClassRoom(new GoodPupil());
    }
}

