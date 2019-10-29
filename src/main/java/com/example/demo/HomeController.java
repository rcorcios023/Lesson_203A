package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/patientform")
    public String patientFormPage(Model model){
        model.addAttribute("patient", new Patient());
        return "patientform";
    }
    @PostMapping("/patientform")
    public String patientFromPage(@ModelAttribute Patient patient, Model model) {
        model.addAttribute("patient", patient);
        return "confirmationform";
    }
}
