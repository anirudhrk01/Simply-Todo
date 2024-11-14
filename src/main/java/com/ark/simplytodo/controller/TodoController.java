package com.ark.simplytodo.controller;

import com.ark.simplytodo.entity.TodoTask;
import com.ark.simplytodo.errors.TodoException;
import com.ark.simplytodo.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/task/{id}")
    public TodoTask getTask(@PathVariable int id) throws TodoException {
    return todoService.getTask(id);
    }

    @GetMapping("/tasks")
    public List<?> getAllTasks() throws TodoException {
        return todoService.getAllTasks();
    }


    @DeleteMapping("/task/{id}")
    public void deleteTask(@PathVariable int id) throws TodoException {
          todoService.delete(id);

    }
    @PostMapping("/task")
    public TodoTask createTask(@RequestBody TodoTask todoTask) throws TodoException {
            return todoService.createOrUpdate(todoTask);
    }
}
