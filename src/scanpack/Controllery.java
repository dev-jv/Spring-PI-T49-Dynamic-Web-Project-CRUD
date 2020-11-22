package scanpack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class Controllery {
	
	@RequestMapping("/list")
	public String clientlist(Model modeln) {
		
		return "clients-list";
	}
}
 