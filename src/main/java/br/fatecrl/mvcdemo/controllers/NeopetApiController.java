package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Neopet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/neopets")
public class NeopetApiController {
    private static final List<Neopet> NeopetApiController = new ArrayList<Neopet>();

    public NeopetApiController() {
        NeopetApiController.add(new Neopet("28/06", "Acara"));
        NeopetApiController.add(new Neopet("03/01", "Aisha"));
        NeopetApiController.add(new Neopet("08/08", "Blumaroo"));
    }

    @GetMapping
    public List<Neopet> getNeopets() {
        return NeopetApiController;
    }
}
