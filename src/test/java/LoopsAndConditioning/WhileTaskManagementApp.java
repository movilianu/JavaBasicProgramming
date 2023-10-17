package LoopsAndConditioning;

import java.util.ArrayList;

public class WhileTaskManagementApp {
    public static void main(String[] args) {
        ArrayList<WhileTask> tasks = new ArrayList<>();

        tasks.add(new WhileTask("Finish project", "Complete the project report", "2023-06-15"));
        tasks.add(new WhileTask("Buy groceries", "Get milk, eggs, and bread", "2023-06-12"));
        tasks.add(new WhileTask("Exercise", "Go for a jog in the park", "2023-06-11"));

        int index = 0;
        while (index < tasks.size()) {
            WhileTask task = tasks.get(index);
            System.out.println("Title: " + task.getTitle());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Due Date: " + task.getDueDate());
            System.out.println("----------------------");

            index++;
        }
    }
}

class WhileTask {
    private String title;
    private String description;
    private String dueDate;

    public WhileTask(String title, String description, String dueDate) {
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
