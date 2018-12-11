package io.bobz.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private String index;
	private String name;
	private String lastName;
	private long studyProgramId;

	public Student() {
		
	}
	
	public Student(String index, String name, String lastName, long studyProgramId) {
		this.index = index;
		this.name = name;
		this.lastName = lastName;
		this.studyProgramId = studyProgramId;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getstudyProgramId() {
		return studyProgramId;
	}

	public void setstudyProgramId(long studyProgramId) {
		this.studyProgramId = studyProgramId;
	}
	
}
