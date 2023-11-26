package cibertec.edu.pe.DAWI_CL3_IsaiasCapistranoH.controller.seguridad;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seguridad")
public class CambiarPasswordController {

    @GetMapping("/cambiarPassword")
    public String mostrarFormularioCambioPassword() {
        return "seguridad/cambiarPassword";
    }

    @PostMapping("/cambiarPassword")
    public String cambiarPassword(HttpServletRequest request, Model model) {
        String nuevaPassword = request.getParameter("nuevaPassword");
        return "redirect:/home";
    }
}
