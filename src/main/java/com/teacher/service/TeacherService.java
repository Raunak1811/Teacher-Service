package com.teacher.service;

import java.util.List;

import com.teacher.collection.Teacher;

public interface TeacherService {

	String save(Teacher teacher);

	List<Teacher> findAll();

	List<Teacher> getTeacherStartWith(String name);

	void delete(String id);

	List<Teacher> getByAge(Integer minAge, Integer maxAge);	
	

}
