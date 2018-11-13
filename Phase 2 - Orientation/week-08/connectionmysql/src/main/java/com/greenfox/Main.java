package com.greenfox;

import com.greenfox.model.Todo;
import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Main implements CommandLineRunner {

    @Autowired
    TodoRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Todo("Praise the lord"));
        repo.save(new Todo("FEEL THE FULL WRATH OF JESUS", false, true));
        repo.save(new Todo("ALL HAIL THE SAVIOR", true, false));
        repo.save(new Todo("REPENT, HERETICS", true, true));
    }
}
