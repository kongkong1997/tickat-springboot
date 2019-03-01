package com.java.tickat.service;

import com.java.tickat.model.TblTodolistEntity;
import com.java.tickat.repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoListService {
    private TodoListRepository todoListRepository;

    @Autowired
    public TodoListService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

   public List<TblTodolistEntity> show(){
        return this.todoListRepository.findAll();
   }

   public TblTodolistEntity insert(TblTodolistEntity todolist){
        return this.todoListRepository.save(todolist);
   }

   public TblTodolistEntity update(TblTodolistEntity todolist){
        return this.todoListRepository.save(todolist);
   }
    public void remove(String id) {
        this.todoListRepository.deleteById(id);
    }
}
