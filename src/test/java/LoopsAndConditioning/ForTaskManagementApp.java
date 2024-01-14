package LoopsAndConditioning;

import java.util.ArrayList;

public class ForTaskManagementApp {
    public static void main(String[] args) {
        ArrayList<ForTask> tasks = new ArrayList<>();

        tasks.add(new ForTask("Finish project", "Complete the project report", "2023-06-15"));
        tasks.add(new ForTask("Buy groceries", "Get milk, eggs, and bread", "2023-06-12"));
        tasks.add(new ForTask("Exercise", "Go for a jog in the park", "2023-06-11"));

        for (ForTask ceVreMuschiuMeu : tasks) {
            System.out.println("Title:" + ceVreMuschiuMeu.getTitle());
            System.out.println("Description: " + ceVreMuschiuMeu.getDescription());
            System.out.println("Due Date: " + ceVreMuschiuMeu.getDueDate());
            System.out.println("----------------------");
        }
    }
}

class ForTask {
    private String title;
    private String description;
    private String dueDate;

    public ForTask(String title, String description, String dueDate) {
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
