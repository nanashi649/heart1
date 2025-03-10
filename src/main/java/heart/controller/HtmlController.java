package heart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
	@GetMapping("/myLT")
	public String myLT() {
		return "myLT";
	}

	@GetMapping("/colum")
	public String colum() {
		return "colum";
	}

	@GetMapping("/entry")
	public String entry() {
		return "entry";
	}

	@GetMapping("/entry2")
	public String entry2() {
		return "entry2";
	}

	@GetMapping("/userregistration_completion")
	public String user_completion() {
		return "userregistration_completion";
	}

	@GetMapping("/max_heart_rate")
	public String maxHeart() {
		return "max_heart_rate";
	}
}
