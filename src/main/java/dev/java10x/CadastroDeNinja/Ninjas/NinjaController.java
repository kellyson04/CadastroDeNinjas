package dev.java10x.CadastroDeNinja.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Sup bro,thats my first message no Controller :O";
    }

    //Adicionar Ninja - CREATE
    @PostMapping("/create")
    public String criar() {
        return "Aq nos criamos os ninjas";
    }

    //Mostrar Ninjas - READ
    @GetMapping("/read")
    public String ler() {
        return "aq mostramos todos os ninjas";
    }

    //Mostrar ninjas especificos - READ tambem porem com especificações
    @GetMapping("/readbyid")
    public String lerPorId() {
        return "aq mostramos os ninjas tb mas somente os q vc digitar o ID";
    }

    //Alterar dados dos Ninjas - UPDATE
    @PutMapping("/alterar")
    public String alterar() {
        return "aq nós alteramos os ninjas";
    }

    //Deletar Ninja - DELETE
    @DeleteMapping("/deletar")
    public String deletar() {
        return "aq nós deletamos os ninjas";
    }
}
