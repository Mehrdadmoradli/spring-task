package com.mehrdadmoradli.spring_task.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;


@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
	private boolean completed = false;
	private LocalDateTime createdAt;
	private LocalDateTime dueDate;

	public Task() {
		
	}
	public Task(String description, LocalDateTime dueDate) {
		this.description = description;
		this.completed = completed;
		this.dueDate = dueDate;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isCompleted() {
		return this.completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public LocalDateTime getCreatedAt() {
		return this.createdAt;
	}
	public LocalDateTime getDueDate() {
		return this.dueDate;
	}
	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}
	
	@Override
	public String toString() {
		String str = "Task's ID: " + this.id + ", Task's description: " + this.description;
		return str;
	}
}
