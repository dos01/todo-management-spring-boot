package com.todo.todomanagementspringboot.controller;

import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.todomanagementspringboot.model.Todo;
//import com.todo.todomanagementspringboot.repository.TodoRepository;
import com.todo.todomanagementspringboot.service.TodoService;

@RestController
@RequestMapping("/api")

public class TodoController {

	@Autowired
	TodoService serv;

	@PostMapping("/todos")
	public String create(@RequestBody Todo todo) {
		serv.createTodo(todo);
		return "Todo created.";
	}

	@GetMapping("/todos")
	public Collection<Todo> getAll() {
		return serv.getAllTodos();
	}

	@GetMapping("/todos/{id}")
	public Optional<Todo> getById(@PathVariable String id) {
		return serv.findTodoById(id);
	}

	@DeleteMapping("/todos/{id}")
	public String delete(@PathVariable String id) {
		serv.deleteTodoById(id);
		return "Todo record for id= " + id + " deleted.";
	}

	@PutMapping("/todos/{id}")
	public String update(@PathVariable String id, @RequestBody Todo todo) {
		todo.setId(id);
		serv.updateTodo(todo);
		return "Todo " + id + " updated.";
	}

}
