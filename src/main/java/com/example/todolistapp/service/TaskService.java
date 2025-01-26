package com.example.todolistapp.service;

import com.example.todolistapp.entity.Task;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TaskService {

    public List<Task> getTasks();

    public Task getTask(int taskId);

    public Task addTask(Task task);

    public Task updateTask(Task task, int taskId);

    public Task deleteTask(int taskId);


}
