package cigma.pfe.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import cigma.pfe.models.Client;

public class ClientRepositoryImpl implements ClientRepository{
	private ClientRepository dao;
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em=emf.createEntityManager();
	public ClientRepositoryImpl() {
	}
	public Client save(Client c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		return null;
	}
	public Client update(Client c) {
		return dao.update(c);
		}
}
