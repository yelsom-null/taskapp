package com.app.todo;

import com.app.todo.model.Task;
import com.app.todo.model.AppUser;
import com.app.todo.taskrepo.TaskRepo;
import com.app.todo.taskrepo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasksApplication implements CommandLineRunner {

    @Autowired
    UserRepo userRepo;
    TaskRepo taskRepo;

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        AppUser appUser = new AppUser();
        appUser.setPassword("should be");
        appUser.setUsername("Null");


        Task task = new Task();
        task.setTitle("Make food.");

        appUser.getTaskList().add(task);
        userRepo.save(appUser);
        taskRepo.save(task);


    }
}
