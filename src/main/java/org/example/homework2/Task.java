package org.example.homework2;

public class Task {
    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }
    public String getDescription() { return description; }
    public int getPriority() { return priority; }

    @Override
    public String toString() {
        return "Task{priority=" + priority + ", description='" + description + "'}";
    }
}
