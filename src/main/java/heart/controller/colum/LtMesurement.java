package heart.controller.colum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LtMesurement {
	@GetMapping("/ltMesurement")
	public String ltMesurement() {
		return "ltMesurement";
	}
}

