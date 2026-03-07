package dev.java10x.CadastroDeNinja.Missoes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @GetMapping("/listar")
    public String listarMissoes() {
        return "missoes listadas";
    }

    @PostMapping("/criar")
    public String criarMissao() {
        return "missao criada";
    }

    @PutMapping("/alterar")
    public String alterarMissao() {
        return "missao alterada";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "missao deletada";
    }

}
