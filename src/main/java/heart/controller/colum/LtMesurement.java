package heart.controller.colum;

import org.springframework.web.bind.annotation.GetMapping;

public class LtMesurement {
	@GetMapping("/ltColum")
	public String ltMesurement() {
		return "ltMesurement";
	}
}

