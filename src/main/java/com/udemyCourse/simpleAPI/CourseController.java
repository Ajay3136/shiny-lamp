package com.udemyCourse.simpleAPI;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/")
	public String home(){
		return "Home";
	}
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course((long) 1, "Physics", "CBD101"),
				new Course((long) 2, "Chemistry", "CBD223")
				);
	}

}