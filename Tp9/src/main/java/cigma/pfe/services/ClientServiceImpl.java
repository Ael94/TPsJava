package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import lombok.Setter;

@Setter
public class ClientServiceImpl implements ClientService {
	private ClientRepository dao;

   
    @Override
    public Client save (Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return dao.save(c);
    }

   
    private ClientServiceImpl(ClientRepository dao) {
		
		this.dao = dao;
	}


	public Client update(Client c) {
		return dao.update(c);
		}

}
