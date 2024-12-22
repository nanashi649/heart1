package heart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import heart.model.HeartRate;
import heart.service.InsertLtService;

@Controller
public class InsertLTController {

	private  final InsertLtService service;
	
	public InsertLTController(InsertLtService service) {
		this.service = service;
	}

	// HeartRateのデータを受け取る
	@PostMapping("/insertLTController")
	public String insertLT(HeartRate model) {
		service.setLT(model); // サービスにモデルを渡す
		return "myLT"; // myLTビューを返す
	}
}
