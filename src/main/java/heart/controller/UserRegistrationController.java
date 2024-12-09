package heart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import heart.model.UserModel;
import heart.service.UserService;

@Controller
public class UserRegistrationController {

	@Autowired
	UserService service;
	
	@GetMapping("/userregistration")
	public String userRegistration() {
		return "userregistration";
	}
	@PostMapping("/userregistration")
	public String userRegistration_post(UserModel model) {
		service.insertUser(model);
		//トップページなどができたら変更の余地あり
		return "userregistration";
	}
	
}
