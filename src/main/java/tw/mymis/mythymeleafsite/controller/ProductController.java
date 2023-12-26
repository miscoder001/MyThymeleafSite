package tw.mymis.mythymeleafsite.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/product")
    public String showProduct() {
        return "product-page";
    }

    @GetMapping("/data")
    public String showDataExchange(Model m, HttpSession session , HttpServletRequest request) {
        session.setAttribute("mesg", "透過 session 傳遞的資料");
        //
        request.setAttribute("mesg", "這是透過 request 傳遞的資料");
        m.addAttribute("mesg" , "這是用 model 傳遞的資料");
        //
        // String pmesg = request.getParameter("mesg");
        return "DataExchange";
    }
}
