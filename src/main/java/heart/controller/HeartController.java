package heart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeartController {
	@GetMapping("/maxHeart")
	public String maxHeart() {
		return "max_heart_rate";
	}

}
