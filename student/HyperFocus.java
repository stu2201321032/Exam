package student;

public class HyperFocus extends StudentPowerDecorator {
    public HyperFocus(Student student) {
        super(student);
    }

    @Override
    public void solveTask() {
        System.out.println(student.getName() + " използва свръхконцентрация!");
        student.solveTask();
    }
}
