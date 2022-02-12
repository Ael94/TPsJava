package cigma.pfe;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.models.Promotion;

public class MonApp {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctrl = (ClientController) context.getBean("controller");
				Client clt = new Client("OMAR");
				CarteFidelio carteFidelio = new CarteFidelio("A29930489");
				carteFidelio.setClient(clt);
				clt.setCarteFidelio(carteFidelio);
				ctrl.save(clt);
				}

}
