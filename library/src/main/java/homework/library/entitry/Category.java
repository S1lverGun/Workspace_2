package homework.library.entitry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "category")
public class Category {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column (length = 50, nullable = false)
	public String name;

}
