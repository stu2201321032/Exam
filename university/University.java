package university;

import student.Student;
import task.Task;
import task.TaskFactory;

public class University {
    private static University instance;

    private University() {}

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }

    public void startExam(Student student) {
        Task task = TaskFactory.createTask(student.getStudentType());
        student.receiveTask(task);
    }
}
