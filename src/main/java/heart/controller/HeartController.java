package heart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeartController {
	@GetMapping("/maxheart")
	public String maxHeart() {
		return "MaxHeartRate";
	}
	
}
