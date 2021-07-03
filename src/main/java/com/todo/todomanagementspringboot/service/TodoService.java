package com.todo.todomanagementspringboot.service;

import java.util.Collection;
import java.util.Optional;

import com.todo.todomanagementspringboot.model.Todo;


public interface TodoService {
	
	public void createTodo(Todo todo);

	public Collection<Todo> getAllTodos();

	public Optional<Todo> findTodoById(String id);

	public void deleteTodoById(String id);

	public void updateTodo(Todo todo);


}
