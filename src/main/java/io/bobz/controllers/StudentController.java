package io.bobz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.bobz.services.StudentService;
import io.bobz.student.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method=RequestMethod.GET, value="/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/students/{index}")
	public Student getStudent(@PathVariable String index) {
		return studentService.getStudent(index);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/students/by_study_program/{id}")
	public List<Student> getAllStudentsByStudyProgram(@PathVariable long id) {
		return studentService.getAllStudentsByStudyProgram(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/students")
	public void createStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.PATCH, value="/students/{index}")
	public void updateStudent(@RequestBody Student student, @PathVariable String index) {
		studentService.updateStudent(student, index);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/students/{index}")
	public void deleteStudent(@PathVariable String index) {
		studentService.deleteStudent(index);
	}
	
}
