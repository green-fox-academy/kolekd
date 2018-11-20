package com.greenfox.frontend;

import com.greenfox.frontend.models.Log;
import com.greenfox.frontend.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FrontendApplication implements CommandLineRunner {

    @Autowired
    LogRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(FrontendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Log("/lol", "HELLO LOLOLOLOL HELLOSAFOAFN"));
        repo.save(new Log("/mosafl", "HsadfLLO 5689481AFN"));
        repo.save(new Log("padfywl", "poiuytredfghjk HELLOSAFOAFN"));
    }
}