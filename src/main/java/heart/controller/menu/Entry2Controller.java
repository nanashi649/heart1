package heart.controller.menu;

import org.springframework.web.bind.annotation.GetMapping;

public class Entry2Controller {
	@GetMapping("/entry2")
	public String entry2() {
		return "entry2";
	}
}
