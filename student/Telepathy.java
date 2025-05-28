package student;

public class Telepathy extends StudentPowerDecorator {
    public Telepathy(Student student) {
        super(student);
    }

    @Override
    public void solveTask() {
        System.out.println(student.getName() + " използва телепатия!");
        student.solveTask();
    }
}
