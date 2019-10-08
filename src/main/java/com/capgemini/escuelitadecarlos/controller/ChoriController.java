package com.capgemini.escuelitadecarlos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.capgemini.escuelitadecarlos.model.Choripan;

@Controller
public class ChoriController {
	
	@GetMapping("/costanera")
	public String choriForm(Model model) {
        model.addAttribute("choripan", new Choripan());
        return "choriform";
    }

    @PostMapping("/costanera")
    public String choriSubmit(@ModelAttribute Choripan choripan) {
        return "result";
    }
}
