package com.example.todolistapp.service;

import com.example.todolistapp.entity.Task;
import com.example.todolistapp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImplementation implements TaskService{

    @Autowired
    ToDoRepository toDoRepository;
    List<Task> taskList;

    public TaskServiceImplementation(){
        taskList = new ArrayList<>();
    }

    public List<Task> getTasks(){
//        return taskList;
        return toDoRepository.findAll();
    }

    public Task getTask(int taskId){
//        Task t = null;
//        for(Task task: taskList){
//            if(task.getId() == taskId){
//                t = task;
//                break;
//            }
//        }
//        return t;
        return toDoRepository.findById(taskId).orElse(new Task());
    }

    public Task addTask(Task task){
//        taskList.add(task);
//        return task;
        return toDoRepository.save(task);
    }

    public Task updateTask(Task task, int taskId){
//        for(Task item: taskList){
//            if (item.getId() == taskId){
//                item.setId(task.getId());
//                item.setTitle(task.getTitle());
//                item.setDescription(task.getDescription());
//                item.setPriority(task.getPriority());
//                item.setStatus(task.getStatus());
//                item.setCreatedAt(task.getCreatedAt());
//                item.setUpdatedAt(task.getUpdatedAt());
//                item.setDueDate(task.getDueDate());
//                return item;
//            }
//        }
//        return null;
        return toDoRepository.save(task);
    }

    public Task deleteTask(int taskId){
//        for(Task task: taskList){
//            if(task.getId() == taskId){
//                taskList.remove(task);
//                return task;
//            }
//        }
//        return null;
        Optional<Task> task = toDoRepository.findById(taskId);
        if (task.isPresent()){
            toDoRepository.deleteById(taskId);
            return task.get();
        }
        return null;
    }

}
