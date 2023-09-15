package com.teacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.collection.Teacher;
import com.teacher.exception.TeacherNotFound;
import com.teacher.exception.TeacherNotFoundException;
import com.teacher.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public String save(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher).getTeacherName();
	}

	@Override
	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	/*@Override
	public List<Teacher> getTeacherStartWith(String name) throws TeacherNotFoundException  {
		// TODO Auto-generated method stub
		try {
			return teacherRepository.findByTeacherNameStartsWith(name);
		} catch (Exception e) {
			throw new TeacherNotFoundException("Teacher not found" +e.getMessage());
		}
	}*/
	
	/*@Override
	public List<Teacher> getTeacherStartWith(String name) {
		// TODO Auto-generated method stub
			return teacherRepository.findByTeacherNameStartsWith(name).orElseThrow(()->new TeacherNotFound("not found"));
	
	}*/
	
	@Override
	public List<Teacher> getTeacherStartWith(String name) throws TeacherNotFound {
		
		try {
			return teacherRepository.findByTeacherNameStartsWith(name);
		}
		catch (Exception e) {
			throw new TeacherNotFound("Not Found!");
		}
	}
	

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		teacherRepository.deleteById(id);
	}
	
	@Override
	public List<Teacher> getByAge(Integer minAge, Integer maxAge) {
		// TODO Auto-generated method stub
		return teacherRepository.findByAgeBetween(minAge, maxAge);
	}
	
	/*@Override
	public List<Teacher> getByAge(Integer minAge, Integer maxAge) {
		// TODO Auto-generated method stub
		return teacherRepository.findTeacherByAgeBetween(minAge, maxAge);
	}*/

}