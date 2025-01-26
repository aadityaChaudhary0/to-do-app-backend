package com.example.todolistapp.repository;

import com.example.todolistapp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<Task, Integer> {

}
