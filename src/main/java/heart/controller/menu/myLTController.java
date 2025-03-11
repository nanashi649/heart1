package heart.controller.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class myLTController {

   @GetMapping("/myLT")
   public String myLT() {
	   return "myLT";
   }
}
