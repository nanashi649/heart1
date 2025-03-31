package heart.controller.colum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InformationHeartTraining {
    
    @GetMapping("/informationHeartTraining")
    public String informationHeartTraining() {
        return "informationHeartTraining";  // templates/informationHeartTraining.html を表示
    }
}
