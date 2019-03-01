package com.java.tickat.repository;

import com.java.tickat.model.TblTodolistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TblTodolistEntity,String> {

}
