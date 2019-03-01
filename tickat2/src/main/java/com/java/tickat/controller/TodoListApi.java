package com.java.tickat.controller;

import com.java.tickat.model.TblTodolistEntity;
import com.java.tickat.repository.TodoListRepository;
import com.java.tickat.service.TodoListService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todolist")
public class TodoListApi {
    private final TodoListService todoListService;
    private final TodoListRepository todoListRepository;

    @Autowired
    public TodoListApi(TodoListService todoListService, TodoListRepository todoListRepository) {
        this.todoListService = todoListService;
        this.todoListRepository = todoListRepository;
    }

    @RequestMapping("")
    public List<TblTodolistEntity> info(Authentication authentication) {
        return this.todoListService.show();
    }

    @PostMapping("")
    @ResponseBody
    public Object insert(@Valid TblTodolistEntity todolistEntity) {
        return this.todoListService.insert(todolistEntity);
    }

    @PostMapping("/{id}")
    @ResponseBody
    public boolean update(@PathVariable String id, String title, boolean available, String content) {
        Optional<TblTodolistEntity> todolistEntity = todoListRepository.findById(id);
        if (todolistEntity!= null) {
            TblTodolistEntity todolist = todolistEntity.get();
            todolist.setTitle(title);
            todolist.setAvailable(available);
            todolist.setContent(content);
            return todoListService.update(todolist) != null;
        }
        return false;
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public boolean remove(@PathVariable String id) {
        todoListService.remove(id);
        return true;
    }

}
