package com.example.springmvc.service;

import com.example.springmvc.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task addTask(Task task) {
        tasks.add(task);
        return task;
    }

    public boolean deleteTask(int id) {
        Optional<Task> toDelete = tasks.stream().filter(t -> t.getId() == id).findFirst();
        if (toDelete.isPresent()) {
            tasks.remove(toDelete.get());
            return true;
        }
        return false;
    }
}
