package crud.scanpack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import crud.daopack.clientdao;
import crud.entity.Client;

@Controller
@RequestMapping("/client")
public class Controllery {
	
	@RequestMapping("/list")
	public String clientlist(Model modeln) {
		
		// get clients from DAO
		
		List<Client> ClientsS = clientDAO.getClients();
		
		// add clients to model
		
		modeln.addAttribute("clientsQ", ClientsS);
		
		return "clients-list";
	}
	
	@Autowired
	private clientdao clientDAO;
} 


