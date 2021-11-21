package com.abdicodes.todo.reminders.controller;


import com.abdicodes.todo.reminders.repository.TodoRepository;
import com.abdicodes.todo.reminders.model.Todo;
import com.abdicodes.todo.reminders.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/reminders")

public class TodoController {


    @Autowired
    private TodoRepository todoRepository;


    @GetMapping
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }


    @PostMapping
    public Todo save(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @PutMapping
    public Todo update(@RequestBody Todo todo){
        return todoRepository.save(todo);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        todoRepository.deleteById(id);
    }





}