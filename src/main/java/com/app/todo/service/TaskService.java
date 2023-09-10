package com.app.todo.service;


import com.app.todo.taskrepo.TaskRepo;
import com.app.todo.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    public TaskService(TaskRepo taskRepo){
        this.taskRepo = taskRepo;
    }
    private Task task;
    private TaskRepo taskRepo;

    List<Task> taskList = new ArrayList<>();

    public List<Task> getTaskList() {
        return taskList;
    }

    public Task saveTask(Task task) {
        return taskRepo.save(task);

    }

    public void deleteItems(Long id){
        taskRepo.deleteById(id);
    }

    public Task updateTask(Task task){
        taskRepo.findById(task.getId());
        return task;
    }





}
