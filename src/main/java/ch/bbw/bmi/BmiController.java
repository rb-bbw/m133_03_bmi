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
        return "bmi_form";
    }
    @PostMapping("/bmi")
    public String bmiSubmit(Model model, @ModelAttribute Bmi bmi) {
        bmi.calculateBmi();
        model.addAttribute("bmi", bmi);
        return "bmi_result";
    }
}