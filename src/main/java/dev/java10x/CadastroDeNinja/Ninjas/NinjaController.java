package dev.java10x.CadastroDeNinja.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Sup bro,thats my first message no Controller :O";
    }
}
