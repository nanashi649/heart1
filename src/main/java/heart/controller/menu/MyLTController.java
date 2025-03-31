//package heart.controller.menu;
//
//import java.util.Collections;
//import java.util.List;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import heart.model.HeartRate;
//import heart.service.AuthService;
//import heart.service.MyLTService;
//
//@Controller
//public class MyLTController {
//
//    private final MyLTService service;
//    private final AuthService authService;
//
//    public MyLTController(MyLTService service, AuthService authService) {
//        this.service = service;
//        this.authService = authService;
//    }
//
//    @GetMapping("/myLT")
//    public String myLT(Model model) {
//        String id = authService.getLoggedInUserId();
//        HeartRate heartRate = service.findLT(id); // 1件のデータを取得
//        
//        // 取得した HeartRate をリストに変換
//        List<HeartRate> ltList = (heartRate != null) ? Collections.singletonList(heartRate) : Collections.emptyList();
//        
//        model.addAttribute("ltList", ltList); // Model に追加
//        return "myLT"; // myLT.html にデータを渡す
//    }
//}


package heart.controller.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import heart.model.HeartRate;
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
		HeartRate heartRate = service.findLT(id);
	   return "myLT";
   }
}
