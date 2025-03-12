package heart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeartController {
	@GetMapping("/max_heart_rate")
	public String maxHeart() {
		return "max_heart_rate";
	}

}
