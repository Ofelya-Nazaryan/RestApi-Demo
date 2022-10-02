package com.example.restapidemo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student ofelya = new Student(
                    1L,
                    "Ofelya",
                    "ofelya@mail.ru",
                    LocalDate.of(1996, 10, 8),
                    25);
            Student grigor = new Student(
                    2L,
                    "Grigor",
                    "grigor@mail.ru",
                    LocalDate.of(1997, 10, 21),
                    24);
            Student poghos = new Student(
                    3L,
                    "Poghos",
                    "poghos@mail.ru",
                    LocalDate.of(2000, 10, 8),
                    22);
            Student petros = new Student(
                    4L,
                    "Petros",
                    "petros@mail.ru",
                    LocalDate.of(2000, 10, 8),
                    22);

            repository.saveAll(
                    List.of(ofelya,grigor,poghos,petros)
            );
        };

    }
}
