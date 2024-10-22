package org.alexvr.Controller;
import org.alexvr.Model.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class taskManager {

    private List<Task> tasks;

    public taskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String name, LocalDate deadline, String description) {
        Task task = new Task();
        task.setName(name);
        task.setDeadline(deadline);
        task.setDescription(description);
        task.setCompleted(false);
        tasks.add(task);
    }

    public void markTaskAsCompleted(String taskName) {
        for (Task task : tasks) {
            if (task.getName().equals(taskName)) {
                task.setCompleted(true);
                break;
            }
        }
    }

    public void editTask(String taskName, String newName, LocalDate newDeadline, String newDescription) {
        for (Task task : tasks) {
            if (task.getName().equals(taskName)) {
                task.setName(newName);
                task.setDeadline(newDeadline);
                task.setDescription(newDescription);
                break;
            }
        }
    }

    public void removeTask(String taskName) {
        tasks.removeIf(task -> task.getName().equals(taskName));
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public List<Task> getTasksByCompletion(boolean completed) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isCompleted() == completed) {
                result.add(task);
            }
        }
        return result;
    }
}
