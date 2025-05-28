import arrival.*;
import student.*;
import university.University;

public class Main {
    public static void main(String[] args) {
        Student student1 = new HyperFocus(new Student("Александър", "вундеркинд", new JumpingRun()));
        Student student2 = new FastWriter(new Student("Антоан", "фитнес маниак", new Teleportation()));
        Student student3 = new Telepathy(new Student("Даниел", "калитко", new SleepyBus()));

        University university = University.getInstance();

        for (Student s : new Student[]{student1, student2, student3}) {
            s.arrive();
            university.startExam(s);
            s.solveTask();
            System.out.println();
        }
    }
}