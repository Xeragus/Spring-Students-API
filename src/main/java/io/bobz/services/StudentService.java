package io.bobz.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.bobz.repositories.StudentRepository;
import io.bobz.repositories.StudyProgramRepository;
import io.bobz.student.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		
		return students;
	}
	
	public Student getStudent(String index) {
		return studentRepository.findById(index).get();
	}
	
	public List<Student> getAllStudentsByStudyProgram(long id) {
		List<Student> students = this.getAllStudents();
		List<Student> filteredStudents = new ArrayList<>();
		
		for (Student student : students) {
			if(student.getstudyProgramId() == id) {
				filteredStudents.add(student);
			}
		}

		return filteredStudents;
	}
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void updateStudent(Student student, String index) {
		studentRepository.save(student);
	}
	
	public void deleteStudent(String index) {
		studentRepository.deleteById(index);
	}
	
}
