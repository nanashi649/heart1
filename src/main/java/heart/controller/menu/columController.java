package heart.controller.menu;

import org.springframework.web.bind.annotation.GetMapping;

public class columController {
	@GetMapping("/colum")
	public String colum() {
		return "colum";
	}

}
