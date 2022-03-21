package ch.bbw.bmi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BmiController {
    @GetMapping("/bmi")
    public String bmiForm(Model model) {
        model.addAttribute("bmi", new Bmi());
        return "bmi";
    }
    @PostMapping("/bmi")
    public String bmiSubmit(Model model, @ModelAttribute Bmi bmi) {
        model.addAttribute("bmi", bmi);
        return "bmi";
    }
}