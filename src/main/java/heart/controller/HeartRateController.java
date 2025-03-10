package heart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import heart.model.HeartRate;
import heart.service.MaxHeartRateService;

@Controller
public class HeartRateController {
	
	private  final MaxHeartRateService service;
	
	public HeartRateController(MaxHeartRateService service) {
		this.service = service;
	}

	@PostMapping("/MaxHeart")
	public String RegistRate(HeartRate model) {
		service.saveHeartRate(model);
		return "max_heart_rate";
	}

}
