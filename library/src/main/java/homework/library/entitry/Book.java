package homework.library.entitry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "book")
public class Book {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column (length = 50, unique = true, nullable = false)
	private String isbn;
	
	@Column (length = 150, nullable = false)
	private String name;
	
	@Column (name = "publication_date", nullable = false)
	private String publicationDate;
	
}
