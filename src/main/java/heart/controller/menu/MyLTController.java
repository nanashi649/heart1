package heart.controller.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import heart.service.AuthService;
import heart.service.MyLTService;

@Controller
public class MyLTController {

	private final MyLTService service;
	
	private final AuthService authService;

	public  MyLTController(MyLTService service, AuthService authService) {
	        this.service = service;
	        this.authService = authService;
	    }
	

	

	@GetMapping("/myLT")
   public String myLT() {
		String id = authService.getLoggedInUserId();
		service.findLT(id);
	   return "myLT";
   }
}
