package Course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.yaml.snakeyaml.events.Event.ID;

import Course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

	List<Course> findByAuthor(String Author);
}
