package heart.controller.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class columController {
	@GetMapping("/colum")
	public String colum() {
		return "colum";
	}

}
