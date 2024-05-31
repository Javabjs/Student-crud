package com.biju.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository sRepository;
	
	@Override
	public Student addStudent(Student student) {
		sRepository.save(student);
		return student;
	}

	@Override
	public Optional<Student> getStudentById(Long id) {
		
		return sRepository.findById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return sRepository.findAll();
	}

	@Override
	public String deleteById(Long id) {
		// TODO Auto-generated method stub
		sRepository.deleteById(id);
		return "Student deleted with id:"+id;
	}

	@Override
	public Student updateStudentById(Long id,Student student) {
		Optional<Student> std=sRepository.findById(id);
		Student st=std.get();
		st.setName(student.getName());
		st.setSection(student.getSection());
		st.setRollno(student.getRollno());
		st.setBranch(student.getBranch());
		return sRepository.save(st);
	}
	 
	
	

	
}
