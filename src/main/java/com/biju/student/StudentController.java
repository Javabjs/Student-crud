package com.biju.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/student")

public class StudentController {
	@Autowired
	private StudentService sService;
	
	@PostMapping()
	public Student addStudent(@RequestBody Student student) {
		
		return sService.addStudent(student) ;
		
	}
	
	@GetMapping("/{id}")
	public Optional<Student> getStudentById(@PathVariable Long  id ) {
		return sService.getStudentById(id);
		
	}
	
	@GetMapping()
	public List<Student> getAllStudent(){
		return sService.getAllStudent();
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable Long id) {
		return sService.deleteById(id);
		
	}
	
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable Long id,@RequestBody Student student) {
		return sService.updateStudentById(id, student);
	}
	
	
	
	 
 
}
