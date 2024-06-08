package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Neopet;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/neopets")
public class NeopetController {
    private static final List<Neopet> NeopetController = new ArrayList<Neopet>();

    public NeopetController() {
        NeopetController.add(new Neopet("28/06", "Acara"));
        NeopetController.add(new Neopet("03/01", "Aisha"));
        NeopetController.add(new Neopet("08/08", "Blumaroo"));
    }

    @GetMapping
    public String getNeopets(Model model) {
        model.addAttribute("neopets", NeopetController);
        return "neopets";
    }
}
