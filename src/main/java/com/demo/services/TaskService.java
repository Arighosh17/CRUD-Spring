//package com.demo.services;
//
//import com.demo.models.TaskModel;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//
//public class TaskService {
//    @Autowired
//    private TaskRepository taskRepository;
//
//    public List<TaskModel> getAllTasks() {
//        return taskRepository.findAll();
//    }
//    public Optional<TaskModel> getTaskById(Long id) {
//        return taskRepository.findById(id);
//    }
//    public TaskModel createTask(TaskModel task) {
//        return taskRepository.save(task);
//    }
//
//    public TaskModel updateTask(Long id, TaskModel taskDetails) {
//        TaskModel task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
//        task.setTitle(taskDetails.getTitle());
//        task.setDescription(taskDetails.getDescription());
//        task.setPriority(taskDetails.getPriority());
//        task.setDue(taskDetails.getDue());
//        return taskRepository.save(task);
//    }
//
//    public void deleteTask(Long id) {
//        TaskModel task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
//        taskRepository.delete(task);
//    }
//}


package com.demo.services;

import com.demo.models.TaskModel;
import com.demo.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<TaskModel> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<TaskModel> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public TaskModel createTask(TaskModel task) {
        return taskRepository.save(task);
    }

    public TaskModel updateTask(Long id, TaskModel taskDetails) {
        TaskModel task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        task.setTitle(taskDetails.getTitle());
        task.setDescription(taskDetails.getDescription());
        task.setPriority(taskDetails.getPriority());
        task.setDue(taskDetails.getDue());
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        TaskModel task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        taskRepository.delete(task);
    }
}

