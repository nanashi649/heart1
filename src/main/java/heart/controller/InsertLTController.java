package heart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import heart.model.HeartRate;
import heart.service.InsertLTService;

@Controller
public class InsertLTController {

    @Autowired
    private InsertLTService service;

    // HeartRateのデータを受け取る
    @PostMapping("/insertLTController")
    public String insertLT(HeartRate model) {
        service.setLT(model); // サービスにモデルを渡す
        return "myLT"; // myLTビューを返す
    }
}
