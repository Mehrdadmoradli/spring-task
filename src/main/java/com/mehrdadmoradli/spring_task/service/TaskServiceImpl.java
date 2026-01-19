package com.mehrdadmoradli.spring_task.service;
import com.mehrdadmoradli.spring_task.entity.Task;
import com.mehrdadmoradli.spring_task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

public class TaskServiceImpl implements TaskService {
	@Autowired
	public TaskRepository taskRepository;
	
	@Override
	public Task createTask(Task task) {
		return taskRepository.save(task);
	}
	@Override
	public Task readTask(Long id) {
		return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task Not Found!"));	
	}
	@Override
	public List<Task> getAllTasks(){
		List<Task> list = taskRepository.findAll();
		return list;
	}
	@Override
	public boolean updateTask(Long id, Task updatedTask) {
		Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task Not Found!"));
		task.setDescription(updatedTask.getDescription());
		task.setCompleted(updatedTask.isCompleted());
		task.setDueDate(updatedTask.getDueDate());
		taskRepository.save(task);
		return true;
	}
	@Override 
	public boolean deleteTask(Long id) {
		Task task = readTask(id);
		taskRepository.deleteById(id);
		return true;
	}
}
