package com.restapi.SpringREST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.SpringREST.entity.Course;
import com.spring.RestApi.Services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	@GetMapping ("/home")
	
	public String home () {
		return "welcome";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
}
