package Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	// @Autowired
	// private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {

		repository.save(new Course(1, "Learn JPA!!!", "in28minutes"));
		repository.save(new Course(2, "Learn hybernate", "in28minutes"));
		repository.save(new Course(3, "Learn AWS", "in28minutes"));
		repository.save(new Course(4, "Learn Rest API'S", "in28minutes"));

		repository.deleteById(1l);

		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));

		System.out.println(repository.findAll());
		System.out.println(repository.count());

		System.out.println(repository.findByAuthor("in28minutes"));
	}

}
