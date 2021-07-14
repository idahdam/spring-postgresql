package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
			Student hadi = new Student(
				"Hadi",
				LocalDate.of(2000, Month.APRIL, 5),
				"nasshitell@gmail.com"
			);
			Student idah = new Student(
				"Idah",
				LocalDate.of(2002, Month.AUGUST, 8),
				"nasshitell@ymail.com"
			);

            repository.saveAll(
                List.of(hadi, idah)
            );
        };
    }
}
