package io.bobz.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.bobz.repositories.StudyProgramRepository;
import io.bobz.studyprogram.StudyProgram;

@Service
public class StudyProgramService {
	
	@Autowired
	private StudyProgramRepository programRepository;
	
	public List<StudyProgram> getAllStudyPrograms() {
		List<StudyProgram> studyPrograms = new ArrayList<>();
		programRepository.findAll().forEach(studyPrograms::add);
		
		return studyPrograms;
	}
	
	public StudyProgram getStudyProgram(long id) {
		return programRepository.findById(id).get();
	}
	
	public void addStudyProgram(StudyProgram studyProgram) {
		programRepository.save(studyProgram);
	}
	
	public void updateStudyProgram(StudyProgram studyProgram, long id) {
		programRepository.save(studyProgram);
	}
	
	public void deleteStudyProgram(long id) {
		programRepository.deleteById(id);
	}
}
