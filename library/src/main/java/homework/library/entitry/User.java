package homework.library.entitry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "user")
public class User {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column (length = 50, nullable = false)
	private String name;
	
	@Column (name = "phone_number", length = 15, nullable = false)
	private String phoneNumber;
	
	@Column (length = 50, nullable = false, unique = true)
	private String email;
	
	@Column (name = "birth_day", nullable = false)
	private String birthDay;
	
	@Column (columnDefinition = "TEXT")
	private String details;
}
