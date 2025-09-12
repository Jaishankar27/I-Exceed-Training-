import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Task class with priority and sorting value
class Task {
    private String title;
    private String priority;
    private boolean isCompleted;

    public Task(String title, String priority) {
        this.title = title;
        this.priority = priority;
        this.isCompleted = false;
    }
    public String getTitle() {
        return title;
    }
    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markCompleted() {
        isCompleted = true;
    }

    // Priority value for sorting
    public int getPriorityValue() {
        switch (priority.toLowerCase()) {
            case "high":
                return 1;
            case "medium":
                return 2;
            case "low":
                return 3;
            default: 
                return 4; 
        }
    }

    @Override
    public String toString() {
        return (isCompleted ? "[done] " : "[ ] ") + title + " (Priority: " + priority + ")";
    }
}

// ToDoList class managing tasks
class ToDoList {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String title, String priority) {
	if (title == null || title.trim().isEmpty()) {
             System.out.println("Task title cannot be empty.");
             return;
        }
	for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Task with the same title already exists.");
                return;
            }
        }
        tasks.add(new Task(title, priority)); //calls Task constructor and stores the reference to obj in arraylist, the heap contains objects
        System.out.println("Task added.");
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);   //it removes the reference to that object in arraylist and shifts the elements to left, thereby leaving no gap
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void markTaskCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();  // here since tasks.get(index) return object which can be used to call method 
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i)); //overrides the default ToString() method when printing object
        }
    }

    public void viewTasksByStatus(boolean completed) {
        boolean found = false;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).isCompleted() == completed) {
                System.out.println(i + ". " + tasks.get(i));  //Checks for completed or pending task, if none found comes to if condition below
                found = true;
            }
        }
        if (!found) {
            System.out.println("No " + (completed ? "completed" : "pending") + " tasks found.");
        }
    }

    public void sortTasksByPriority() {
        Collections.sort(tasks, Comparator.comparingInt(Task::getPriorityValue));
        System.out.println("Tasks sorted by priority.");
    }
}


public class ToDoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList todoList = new ToDoList();
        int choice;

        do {
            System.out.println("-Todo Application-");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View All Tasks");
            System.out.println("5. View Completed Tasks");
            System.out.println("6. View Pending Tasks");
            System.out.println("7. Sort Tasks by Priority");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine().trim();

                    System.out.print("Enter priority (High/Medium/Low): ");
                    String priority = scanner.nextLine().trim();

                    todoList.addTask(title, priority);
                    break;
                case 2:
                    todoList.viewTasks();
                    System.out.print("Enter index to remove: ");
                    int removeIndex = scanner.nextInt();
                    todoList.removeTask(removeIndex);
                    break;
                case 3:
                    todoList.viewTasks();
                    System.out.print("Enter index to mark completed: ");
                    int completeIndex = scanner.nextInt();
                    todoList.markTaskCompleted(completeIndex);
                    break;
                case 4:
                    todoList.viewTasks();
                    break;
                case 5:
                    todoList.viewTasksByStatus(true);
                    break;
                case 6:
                    todoList.viewTasksByStatus(false);
                    break;
                case 7:
                    todoList.sortTasksByPriority();
                    todoList.viewTasks();
                    break;
                case 0:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}