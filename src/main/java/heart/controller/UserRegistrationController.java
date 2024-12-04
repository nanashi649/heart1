package heart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserRegistrationController {
	
//	@GetMapping("/userregistration")
//	public String userRegistration() {
//	return "userregistration";	
//	}
//	
	@PostMapping("/userregistration")
	public String userRegistration_post() {
		//登録画面後のビューを作成次第変更する
		return "userregistration";
	}
	
}
