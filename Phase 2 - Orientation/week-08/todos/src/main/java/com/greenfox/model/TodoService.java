package com.greenfox.model;

import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public List<Todo> getAllTodos(){
        List<Todo> todos = new ArrayList<>();
        todoRepository.findAll()
                .forEach(todos :: add);
        return todos;
    }

    public void addTodo (Todo todo){
        todoRepository.save(todo);
    }

}
