package io.bobz.studyprogram;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudyProgram {
	
	@Id
	private long id;
	private String name;
	
	public StudyProgram() {
		
	}
	
	public StudyProgram(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
