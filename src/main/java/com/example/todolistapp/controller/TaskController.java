package com.example.todolistapp.controller;

import com.example.todolistapp.entity.Task;
import com.example.todolistapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    //fetch all tasks
    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return this.taskService.getTasks();
    }

    //fetch the task of given taskId
    @GetMapping("/tasks/{taskId}")
    public Task getTask(@PathVariable int taskId){
        return this.taskService.getTask(taskId);
    }

    //add new task
    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task){
        return this.taskService.addTask(task);
    }

    //update task
    @PutMapping("/tasks/{taskId}")
    public Task updateTask(@RequestBody Task task, @PathVariable int taskId){
        return this.taskService.updateTask(task, taskId);
    }

    //delete task
    @DeleteMapping("/tasks/{taskId}")
    public Task deleteTask(@PathVariable int taskId){
        return this.taskService.deleteTask(taskId);
    }

}
