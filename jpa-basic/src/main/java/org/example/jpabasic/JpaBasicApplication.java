package org.example.jpabasic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Member;

@SpringBootApplication
public class JpaBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaBasicApplication.class, args);
    }

}
