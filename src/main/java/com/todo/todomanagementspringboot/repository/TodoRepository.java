package com.todo.todomanagementspringboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.todo.todomanagementspringboot.model.Todo;

public interface TodoRepository extends MongoRepository<Todo, String> {

}
