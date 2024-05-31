package com.biju.student;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Data
@Getter 
@Setter
@ToString
public class StudentDTO {
	private String name;
	private String section;
	private int rollno;
	private String branch;

}
