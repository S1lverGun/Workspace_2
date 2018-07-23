package ua.logos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "teacher")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name", length = 30)
	private String firstName;
	@Column(name = "last_name", length = 35)
	private String lastName;
	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;
	
	
}
