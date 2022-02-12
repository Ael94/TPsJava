package cigma.pfe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Getter
@Setter
@ToString
@Entity
public class CarteFidelio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String code;
	@OneToOne
	@JoinColumn(name = "client_id")
	private Client client;

	public CarteFidelio(String code) {
		this.code = code;
	}

	public CarteFidelio() {
		
	}

	public void setClient(Client clt) {
		
		
	}
}
