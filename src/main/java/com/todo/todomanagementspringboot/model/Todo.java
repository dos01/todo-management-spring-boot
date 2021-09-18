package com.todo.todomanagementspringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")

public class Todo {
	@Id
	private String id;

	private String title;
	private String description;
	private boolean completed;

	public Todo() {
	}

	public Todo(String title, String description, boolean completed) {
		this.title = title;
		this.description = description;
		this.completed = completed;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompete(boolean isCompleted) {
		this.completed = isCompleted;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + completed + "]";
	}

}
