package cigma.pfe.models;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Getter
@Setter
@ToString

public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private double amount;
	private String description;
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	public Facture() {
	}
	public Facture(double amount, String description,Client client) {
	this.amount = amount;
	this.description = description;
	this.client =client;
	}

}
