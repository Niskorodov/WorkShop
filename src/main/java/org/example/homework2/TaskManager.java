package org.example.homework2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public boolean removeTask(Task task) {
        return tasks.remove(task);
    }

    public List<Task> getTasksSortedByPriority() {
        List<Task> sorted = new ArrayList<>(tasks);
        sorted.sort(Comparator.comparingInt(Task::getPriority));
        return sorted;
    }
}
