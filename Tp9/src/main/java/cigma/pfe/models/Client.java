package cigma.pfe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Entity
@ToString
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	@OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
	private List<Facture> factures;
	@ManyToMany(cascade = {CascadeType.PERSIST})
	@JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(name = "client_fk",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name = "promotion_fk",referencedColumnName = "id"))
			
	private List<Promotion> promotions;
	@OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
	private CarteFidelio carteFidelio;
	public Client(String name) {
		this.name = name;
	}

	public Client() {
	}

	public Client(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Client{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

	public static void setCarteFidelio(CarteFidelio carteFidelio2) {
		
		
	}

	public void setPromotions(List<Promotion> promotions2) {
		// TODO Auto-generated method stub
		
	}
}
