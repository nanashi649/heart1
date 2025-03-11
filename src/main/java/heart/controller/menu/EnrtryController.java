package heart.controller.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnrtryController {
	@GetMapping("/entry")
	public String entry() {
		return "entry";
	}
}
