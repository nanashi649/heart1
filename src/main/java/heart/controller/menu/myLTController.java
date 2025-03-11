package heart.controller.menu;

import org.springframework.web.bind.annotation.GetMapping;

public class myLTController {
	@GetMapping("/myLT")
	public String myLT() {
		return "myLT";
	}
}
