package cibertec.edu.pe.DAWI_CL3_IsaiasCapistranoH.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//test
@Controller
public class HomeController {
    @GetMapping("/home")
    public String index(Model model) {
        return "home";
    }
}
