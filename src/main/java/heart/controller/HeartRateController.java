package heart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import heart.model.HeartRate;
import heart.service.MaxHeartRateService;

@Controller
public class HeartRateController {
	
	@Autowired
	MaxHeartRateService service;
	
	@PostMapping("/maxHeart")
	public String RegistRate(HeartRate model) {
		service.setHeartRate(model);
		return "/maxHeart";
	}
}
