package heart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import heart.model.HeartRate;
import heart.service.AuthService;
import heart.service.InsertLtService;

@Controller
public class InsertLTController {

    private final InsertLtService insertLtService;
    private final AuthService authService;

    public InsertLTController(InsertLtService insertLtService, AuthService authService) {
        this.insertLtService = insertLtService;
        this.authService = authService;
    }

    // HeartRateのデータを受け取る
    @PostMapping("/insertLT")
    public String insertLT(HeartRate model) {

        // ログインユーザのIDを取得してHeartRateにセット
        String userId = authService.getLoggedInUserId();
        if (userId == null) {
            throw new IllegalStateException("ログインが必要です");
        }
        model.setId(userId);

        // サービスにmodelを渡す
        insertLtService.setLT(model);

        return "myLT"; // myLTビューを返す
    }
}
