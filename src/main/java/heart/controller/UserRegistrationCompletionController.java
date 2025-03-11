package heart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserRegistrationCompletionController {
	@GetMapping("/userregistration_completion")
	public String user_completion() {
		return "userregistration_completion";
	}
}
