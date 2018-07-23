package homework.library.entitry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "adress")
public class Adress {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column (length = 50, nullable = false)
	private String country;
	
	@Column	(length = 80, nullable = false)
	private String city;
	
	@Column (length = 120, nullable = false)
	private String steet;
	
	@Column (name = "house_number", nullable = false)
	private int houseNumber;
	
	@Column (name = "apartment_number", nullable = false)
	private int apartmentNumber;

}
