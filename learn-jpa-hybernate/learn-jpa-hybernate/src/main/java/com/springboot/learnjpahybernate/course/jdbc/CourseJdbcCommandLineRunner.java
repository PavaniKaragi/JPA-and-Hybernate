package com.springboot.learnjpahybernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learnjpahybernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {

		repository.insert(new Course(1, "Learn JPA!!!", "in28minutes"));
		repository.insert(new Course(2, "Learn hybernate", "in28minutes"));
		repository.insert(new Course(3, "Learn AWS", "in28minutes"));
		repository.insert(new Course(4, "Learn Rest API'S", "in28minutes"));

		repository.deleteById(2);

		System.out.println(repository.findById(1));
		System.out.println(repository.findById(3));

	}

}