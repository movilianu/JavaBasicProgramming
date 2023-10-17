package LoopsAndConditioning;

import java.util.ArrayList;

public class IfElseTaskManagementApp {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Finish project", "Complete the project report", "2023-06-15"));
        tasks.add(new Task("Buy groceries", "Get milk, eggs, and bread", "2023-06-12"));
        tasks.add(new Task("Exercise", "Go for a jog in the park", "2023-06-11"));

        for (Task task : tasks) {
            System.out.println("Title: " + task.getTitle());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Due Date: " + task.getDueDate());

            if (isTaskUrgent(task)) {
                System.out.println("Task is urgent!");
            } else {
                System.out.println("Task is not urgent.");
            }

            System.out.println("----------------------");
        }
    }

    public static boolean isTaskUrgent(Task task) {
        // Implement your logic to determine if the task is urgent or not
        // For example, you can compare the task's due date with the current date
        // and return true if it is approaching or past the due date.
        // This is just a sample implementation.
        return task.getDueDate().compareTo("2023-06-12") <= 0;
    }
}

class Task {
    private String title;
    private String description;
    private String dueDate;

    public Task(String title, String description, String dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }
}
