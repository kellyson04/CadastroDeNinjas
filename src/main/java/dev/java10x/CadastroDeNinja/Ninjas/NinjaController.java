package dev.java10x.CadastroDeNinja.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    //Mostrar ninjas especificos - READ tambem porem com especificações
    @GetMapping("/readbyid/{id}")
    public NinjaModel listarNinjasPorID(@PathVariable Long id) {
        return ninjaService.listarNinjaPorID(id);
    }

    //Alterar dados dos Ninjas - UPDATE
    @PutMapping("/alterar")
    public String alterar() {
        return "aq nós alteramos os ninjas";
    }

    //Deletar Ninja - DELETE
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorID(@PathVariable Long id) {
        ninjaService.deletarNinjaPorID(id);
    }
}
