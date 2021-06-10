package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertController {
    @GetMapping("/convert")
    public ModelAndView showForm() {
        return new ModelAndView("convert");
    }

    @PostMapping("/convert")
    public ModelAndView convert(Double usd, Double rate) {
        ModelAndView modelAndView = new ModelAndView("convert");
        Double result = usd * rate;
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
