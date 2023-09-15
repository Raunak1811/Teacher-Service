package com.teacher.collection;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

/*import lombok.Builder;
import lombok.Data;

@Data
@Builder*/
@Document(collection = "Teacher")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Teacher {

	@Id
	private String teacherId;
	private String teacherName;
	private Integer age;
	private List<String> subject;
	private List<Address> adresses;
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public List<Address> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<Address> adresses) {
		this.adresses = adresses;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", age=" + age + ", subject="
				+ subject + ", adresses=" + adresses + "]";
	}
	public Teacher(String teacherId, String teacherName, Integer age, List<String> subject, List<Address> adresses) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.age = age;
		this.subject = subject;
		this.adresses = adresses;
	}
	public Teacher() {
		super();
	}
	
	

	
}
