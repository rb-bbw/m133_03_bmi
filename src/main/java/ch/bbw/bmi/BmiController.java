package ch.bbw.bmi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

@Controller
public class BmiController implements Serializable {
    private Bmi bmi;

    public BmiController(Bmi bmi) {
        super();
        this.bmi = bmi;
    }

    @GetMapping("/bmi")
    public String bmiForm(Model model) {
        model.addAttribute("bmi", this.bmi);
        return "bmi_form";
    }

    @PostMapping(value="/bmi", params="action=submit")
    public String bmiSubmit(Model model, @ModelAttribute Bmi bmi) {
        this.bmi.setHeight(bmi.getHeight());
        this.bmi.setWeight(bmi.getWeight());

        this.bmi.incrementCount();
        this.bmi.calculateBmi();

        model.addAttribute("bmi", this.bmi);
        return "bmi_result";
    }
    @PostMapping(value="/bmi", params="action=reset")
    public String bmiReset(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/bmi";
    }
}