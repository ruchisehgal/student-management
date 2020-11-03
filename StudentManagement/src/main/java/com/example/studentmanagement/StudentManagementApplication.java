package com.example.studentmanagement;

import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.studentmanagement.entity.StudentEntity;
import com.example.studentmanagement.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init(StudentRepository studentRepository) {
        return args -> {
            Stream.of("Alexa", "Michaela", "Julia", "George", "Steph").forEach(name -> {
                StudentEntity studentEntity = new StudentEntity(new Random().nextLong(), name+ " "+ Math.random(), name, name +" Course " +UUID.randomUUID().toString(), name+"stud@clg.de", name+" Address "+ Math.random());
                studentRepository.save(studentEntity);
            });
            studentRepository.findAll().forEach(System.out::println);
        };
    }

}
