package com.todo.todomanagementspringboot.service;

import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.todo.todomanagementspringboot.repository.TodoRepository;
import com.todo.todomanagementspringboot.model.Todo;

@Component
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoRepository todoRepository;

	@Override
	public void createTodo(Todo todo) {
		todoRepository.save(todo);
	}

	@Override
	public Collection<Todo> getAllTodos() {
		return todoRepository.findAll();
	}

	@Override
	public Optional<Todo> findTodoById(String id) {
		return todoRepository.findById(id);
	}

	@Override
	public void deleteTodoById(String id) {
		todoRepository.deleteById(id);
	}

	@Override
	public void updateTodo(Todo todo) {
		todoRepository.save(todo);
	}

}
