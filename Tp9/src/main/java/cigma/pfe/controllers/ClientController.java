package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import lombok.Setter;

@Setter
public class ClientController {
    ClientService Service;

   
    public Client save (Client c) {
        System.out.println("ClientController level...");
        return Service.save(c);
    }
    public void update(Client c){
    	Service.update(c);
    	}
	private ClientController(ClientService service) {
		
		Service = service;
	}
    

   

}
