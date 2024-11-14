package com.ark.simplytodo.service;


import com.ark.simplytodo.entity.TodoTask;
import com.ark.simplytodo.errors.TodoException;
import com.ark.simplytodo.repository.TodoTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoTaskRepository todoTaskRepository;



    public TodoTask createOrUpdate(TodoTask todoTask) throws TodoException {

        return todoTaskRepository.save(todoTask);
    }

    public TodoTask getTask(int id) throws TodoException{
        return todoTaskRepository.findById(id);
    }

    public void delete(int id) throws TodoException {
        todoTaskRepository.deleteById(id);
    }

    public List <TodoTask> getAllTasks() throws TodoException{
            return todoTaskRepository.findAll();
        }


}
