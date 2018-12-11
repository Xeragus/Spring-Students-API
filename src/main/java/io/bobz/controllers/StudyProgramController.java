package io.bobz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.bobz.services.StudyProgramService;
import io.bobz.studyprogram.StudyProgram;

@RestController
public class StudyProgramController {

	@Autowired
	private StudyProgramService studyProgramService;
	
	@RequestMapping(method=RequestMethod.GET, value="/study_programs")
	public List<StudyProgram> getAllStudents() {
		return studyProgramService.getAllStudyPrograms();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/study_programs/{id}")
	public StudyProgram getStudent(@PathVariable long id) {
		return studyProgramService.getStudyProgram(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/study_programs")
	public void createStudyProgram(@RequestBody StudyProgram studyProgram) {
		studyProgramService.addStudyProgram(studyProgram);
	}
	
	@RequestMapping(method=RequestMethod.PATCH, value="/study_programs/{id}")
	public void updateStudyProgram(@RequestBody StudyProgram studyProgram, @PathVariable long id) {
		studyProgramService.updateStudyProgram(studyProgram, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/study_programs/{id}")
	public void deleteStudyProgram(@PathVariable long id) {
		studyProgramService.deleteStudyProgram(id);
	}
}
