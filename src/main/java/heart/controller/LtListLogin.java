package heart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LtListLogin {
	@GetMapping("/lt_login")
	public String ltLogin() {
		return "lt_login";
	}
}
