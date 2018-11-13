package com.greenfox.controllers;

import com.greenfox.model.TodoService;
import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

    TodoRepository todoRepo;
    TodoService service;

    @Autowired
    public TodoController(TodoRepository todoRepo, TodoService service){
        this.todoRepo = todoRepo;
        this.service = service;
    }

    @GetMapping({"/", "/list"})
    public String list(Model model){
        model.addAttribute("todos", service.getAllTodos());
        return "todolist";
    }
}
