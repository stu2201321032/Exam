package task;

public class TaskFactory {
    public static Task createTask(String studentType) {
        return switch (studentType.toLowerCase()) {
            case "вундеркинд" -> new Task("забавен тип!");
            case "фитнес маниак" -> new Task("непонятен тип!");
            case "калитко" -> new Task("лесен тип!");
            default -> new Task("неизвестен тип задача!");
        };
    }
}
