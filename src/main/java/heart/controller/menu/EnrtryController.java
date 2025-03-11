package heart.controller.menu;

import org.springframework.web.bind.annotation.GetMapping;

public class EnrtryController {
	@GetMapping("/entry")
	public String entry() {
		return "entry";
	}
}
