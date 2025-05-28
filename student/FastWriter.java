package student;

public class FastWriter extends StudentPowerDecorator {
    public FastWriter(Student student) {
        super(student);
    }

    @Override
    public void solveTask() {
        System.out.println(student.getName() + " използва бързопис!");
        student.solveTask();
    }
}
