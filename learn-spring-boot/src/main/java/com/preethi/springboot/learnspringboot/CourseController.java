package com.preethi.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author ppattabiraman URL : /courses return : id, name, author
 *
 */
@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(new Course(1, "Learn AWS", "Preethi Pattabiraman"),
				new Course(2, "Learn DevOps", "Preethi Pattabiraman"),
				new Course(4, "Learn GCP", "Preethi Pattabiraman"),
				new Course(3, "Learn Python", "Preethi Pattabiraman"));
	}
}
