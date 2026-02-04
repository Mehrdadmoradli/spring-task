package com.mehrdadmoradli.spring_task.controller;
import com.mehrdadmoradli.spring_task.service.TaskService;
import com.mehrdadmoradli.spring_task.entity.Task;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	@Autowired
	TaskService service;
	
	@PostMapping
	public Task postTask(@RequestBody Task task) {
		return service.createTask(task);
	}
	@GetMapping("/{id}")
	public Task getTask(@PathVariable Long id) {
		return service.readTask(id);
	}
	@GetMapping 
	public List<Task> getAllTasks(){
		return service.getAllTasks();
	}
	@PutMapping("/{id}")
	public boolean updateTask(@PathVariable Long id, @RequestBody Task task ) {
		return service.updateTask(id, task);
	}
	@DeleteMapping("/{id}")
	public boolean deleteTask(@PathVariable Long id) {
		return service.deleteTask(id);
	}
	
}
