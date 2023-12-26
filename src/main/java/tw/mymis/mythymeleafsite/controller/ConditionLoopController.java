package tw.mymis.mythymeleafsite.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ConditionLoopController {


    @GetMapping("/if")
    public String showIFELSE(Model model, HttpSession session) {
        // 判斷使用者身分
        session.setAttribute("iamadmin", false);
        model.addAttribute("isAdmin", false);
        return "IfElse";
    }

    @GetMapping("/each")
    public String showEach(Model model) {
        // 模擬從資料庫 擷取 產品名稱 出來
        ArrayList<String> products = new ArrayList<>();
        products.add("Ferrari Enzo");
        products.add("Ferrari BB512");
        products.add("Ferrari 360");
        products.add("Lamborghini LP700");
        model.addAttribute("cars", products);
        return "Each";
    }
}
