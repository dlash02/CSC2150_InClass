import java.util.ArrayDeque;
import java.util.Deque;

public class TaskManagerDriver {
    public static void main(String[] args) {
        Deque<Task> taskQueue = new ArrayDeque<>();

        addTask(taskQueue, "Task1", "NORMAL");
        addTask(taskQueue, "Task2", "HIGH");
        addTask(taskQueue, "Task3", "NORMAL");
        processTask(taskQueue); // Should process Task2
        processTask(taskQueue); // Should process Task1
        processTask(taskQueue); // Should process Task3
    }
    public static void addTask(Deque<Task> queue, String name, String priority) {
        Task task = new Task(name, priority);
        if (priority.equals("HIGH")) {
            queue.addFirst(task); // High priority at the front
        } else {
            queue.addLast(task); // Normal priority at the end
        }
        System.out.println("Added " + task);
    }

    public static void processTask(Deque<Task> queue) {
        if (!queue.isEmpty()) {
            Task task = queue.removeFirst();
            System.out.println("Processing " + task);
        } else {
            System.out.println("No tasks to process.");
        }
    }



}
