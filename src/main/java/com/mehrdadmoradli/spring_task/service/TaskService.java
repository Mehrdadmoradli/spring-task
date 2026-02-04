package com.mehrdadmoradli.spring_task.service;
import com.mehrdadmoradli.spring_task.entity.Task;
import java.util.List;

public interface TaskService {
	 Task createTask(Task task);
	 Task readTask(Long id);
	 List<Task> getAllTasks();
	 boolean updateTask(Long id, Task updatedTask);
	 boolean deleteTask(Long id);
}
