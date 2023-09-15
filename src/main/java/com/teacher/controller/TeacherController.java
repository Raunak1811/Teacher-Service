package com.teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.collection.Teacher;
import com.teacher.exception.NotNullException;
import com.teacher.exception.TeacherNotFoundException;
import com.teacher.service.TeacherService;

import io.micrometer.common.util.StringUtils;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	
	//Save new teacher
	@PostMapping("/store")
	public String save(@RequestBody Teacher teacher) throws NotNullException {
		if (StringUtils.isBlank(teacher.getTeacherName())) {
			throw new NotNullException("Name is mandatory");
		}
		return teacherService.save(teacher) + " is Saved!";
	}
	
	
	//Get all teachers
	@GetMapping("/all")
	public List<Teacher> getTeacher(){
		return teacherService.findAll();
	}
	
	
	//search teacher by name
	@GetMapping("/searchname")
	public List<Teacher> getTeacherStartWith(@RequestParam("name") String name) throws TeacherNotFoundException{
		return teacherService.getTeacherStartWith(name);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable String id) {
		teacherService.delete(id);
		return ResponseEntity.ok("Deleted!");
	}
	
	
	@GetMapping("/age")
	public List<Teacher> getByAge(@RequestParam Integer minAge,@RequestParam Integer maxAge){;
	return teacherService.getByAge(minAge, maxAge);
		
	}                                                                                                                                                                              
	
	
}