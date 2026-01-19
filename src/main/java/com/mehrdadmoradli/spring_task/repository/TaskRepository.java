package com.mehrdadmoradli.spring_task.repository;
import com.mehrdadmoradli.spring_task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task, Long>{

}
