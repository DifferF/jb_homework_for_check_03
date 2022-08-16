package homework_03.task_02;

public class BadPupil extends Pupil {

    @Override
    public void study() {
        System.out.println("study Relax");
    }

    @Override
    public void read() {
        System.out.println("read Relax");
    }

    @Override
    public void write() {
        System.out.println("write Relax");
    }

    @Override
    public void relax() {
        System.out.println("relax Relax\n");
    }

}
