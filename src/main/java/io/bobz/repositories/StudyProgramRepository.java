package io.bobz.repositories;

import org.springframework.data.repository.CrudRepository;

import io.bobz.studyprogram.StudyProgram;

public interface StudyProgramRepository extends CrudRepository<StudyProgram, Long>{
	
}
