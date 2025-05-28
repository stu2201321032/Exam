package student;

import arrival.ArrivalStrategy;
import task.Task;

public class Student {
    protected String name;
    protected String studentType;
    protected ArrivalStrategy arrivalStrategy;
    protected Task task;

    public Student(String name, String studentType, ArrivalStrategy arrivalStrategy) {
        this.name = name;
        this.studentType = studentType;
        this.arrivalStrategy = arrivalStrategy;
    }

    public void arrive() {
        System.out.println(name + " пристига чрез " + arrivalStrategy.arrive());
    }

    public void receiveTask(Task task) {
        this.task = task;
        System.out.println(name + " получава задача от " + task.getDescription());
    }

    public void solveTask() {
        System.out.println(name + " решава задачата от " + task.getDescription());
    }

    public String getStudentType() {
        return studentType;
    }

    public String getName() {
        return name;
    }

    public ArrivalStrategy getArrivalStrategy() {
        return arrivalStrategy;
    }

    public Task getTask() {
        return task;
    }
}
