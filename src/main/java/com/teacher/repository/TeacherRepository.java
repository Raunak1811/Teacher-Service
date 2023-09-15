package com.teacher.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.teacher.collection.Teacher;
import com.teacher.exception.TeacherNotFoundException;

@Repository

public interface TeacherRepository extends MongoRepository<Teacher, String> {
	
	List<Teacher> findByTeacherNameStartsWith(String name) throws TeacherNotFoundException;
	
	List<Teacher> findByAgeBetween(Integer minAge, Integer maxAge);
	
	/*@Query(value = "{'age' : { $gt : ?0, $lt : ?1}}")
	List<Teacher> findTeacherByAgeBetween(Integer min, Integer max);
	

 */
}