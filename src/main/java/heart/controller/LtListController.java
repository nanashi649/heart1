package heart.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import heart.model.UserModel;
import heart.service.LtListService;

@Controller
public class LtListController {

	private final LtListService service;

	public LtListController(LtListService service) {
		this.service = service;
	}

	@GetMapping("/list")
	public String showLtList(Model model) {
		List<UserModel> users = service.findUsername("id");
		//Listをstreamを作成
		List<String> data = users.stream()
				//データを変換（stream関数によって一時的にuserが規定）
					.map(user -> user.getUsername() + "(" + user.getLTHeartRate() + ")"
						+  "(" + user.getCurrentDate() + ")")
					//Listを作成
					.collect(Collectors.toList());
		model.addAttribute("data",data);
		return "lt_list";
	}

}
