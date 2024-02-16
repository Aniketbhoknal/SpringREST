package com.spring.RestApi.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restapi.SpringREST.entity.Course;
@Service
public class CourseServicesimpl implements CourseService {

	List<Course> list;
	
	public CourseServicesimpl() {
		list = new ArrayList<>();
		list.add(new Course(145, "core java course", "this course contains basic "));
		list.add( new Course(4323, "spring boot", " creating rest api"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

}
