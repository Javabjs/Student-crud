package com.biju.student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
	Student addStudent(Student student);
	Optional<Student> getStudentById(Long id);
	List<Student> getAllStudent();
	String deleteById(Long id);
	Student updateStudentById(Long id,Student student);
}
