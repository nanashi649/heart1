//package heart.controller;
//
//import org.springframework.stereotype.Controller;
//
//import heart.service.LtListService;
//
//@Controller
//public class LtListController {
//
//	private final LtListService service;
//
//	public LtListController(LtListService service) {
//		this.service = service;
//	}
//
//	//	@GetMapping("/lt_list")
//	//	public String showLtList(Model model) {
//	//		List<UserModel> users = service.findUsername("id");
//	//		//Listをstreamを作成
//	//		List<String> data = users.stream()
//	//				//データを変換（stream関数によって一時的にuserが規定）
//	//					.map(user -> user.getUsername() + "(" + user.getLTHeartRate() + ")"
//	//						+  "(" + user.getCurrentDate() + ")")
//	//					//Listを作成
//	//					.collect(Collectors.toList());
//	//		model.addAttribute("data",data);
//	////		model.addAttribute("data", List.of("データ1", "データ2", "データ3"));
//	//
//	//		return "lt_list";
//	//	}
//
////	@GetMapping("/lt_list")
////	public String showLtList(Model model) {
////		List<UserModel> users = service.findUsername(GROUPnAEME);
////		//Listをstreamを作成
////		List<String> data = users.stream()
////				//データを変換（stream関数によって一時的にuserが規定）
////				.map(user -> user.getUsername() + "(" + user.getLTHeartRate() + ")"
////						+ "(" + user.getCurrentDate() + ")")
////				//Listを作成
////				.collect(Collectors.toList());
////		model.addAttribute("data", data);
////		//		model.addAttribute("data", List.of("データ1", "データ2", "データ3"));
////
////		return "lt_list";
////	}
//
//	
//
//}
