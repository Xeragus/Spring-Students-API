package io.bobz.repositories;

import org.springframework.data.repository.CrudRepository;

import io.bobz.student.Student;

public interface StudentRepository extends CrudRepository<Student, String> {

}
