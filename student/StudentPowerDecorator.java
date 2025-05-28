package student;

import arrival.ArrivalStrategy;
import task.Task;

public abstract class StudentPowerDecorator extends Student {
    protected Student student;

    public StudentPowerDecorator(Student student) {
        super(student.getName(), student.getStudentType(), student.getArrivalStrategy());
        this.student = student;
    }

    @Override
    public void arrive() {
        student.arrive();
    }

    @Override
    public void receiveTask(Task task) {
        student.receiveTask(task);
    }

    @Override
    public String getStudentType() {
        return student.getStudentType();
    }

    @Override
    public String getName() {
        return student.getName();
    }

    @Override
    public ArrivalStrategy getArrivalStrategy() {
        return student.getArrivalStrategy();
    }

    @Override
    public Task getTask() {
        return student.getTask();
    }
}
